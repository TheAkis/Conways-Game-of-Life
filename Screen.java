//for a 20x20 display
public class Screen{
    String st = "*";
    String sp = " ";
    public int he;
    public String[][] screen;// = new String[h][w];
    public String[][][] alpha = {
            {{st,st,st},{st,sp,st},{st,st,st},{st,sp,st}},//a
            {{st,sp,sp},{st,st,st},{st,sp,st},{st,st,st}},//b
            {{st,st,st},{st,sp,sp},{st,sp,sp},{st,st,st}},//c
            {{sp,sp,st},{st,st,st},{st,sp,st},{st,st,st}},//d
            {{st,st,st},{st,st,sp},{st,sp,sp},{st,st,st}},//e
            {{st,st,st},{st,sp,sp},{st,st,sp},{st,sp,sp}},//f
            {{st,st,st},{st,sp,sp},{st,sp,st},{st,st,st}},//g
            {{st,sp,st},{st,st,st},{st,sp,st},{st,sp,st}},//h
            {{st,st,st},{sp,st,sp},{sp,st,sp},{st,st,st}},//i
            {{sp,sp,st},{sp,sp,st},{st,sp,st},{st,st,st}},//j
            {{st,sp,sp},{st,sp,st},{st,st,sp},{st,sp,st}},//k
            {{st,sp,sp},{st,sp,sp},{st,sp,sp},{st,st,st}},//l
            {{st,st,st},{st,st,st},{st,sp,st},{st,sp,st}},//m
            {{st,st,st},{st,sp,st},{st,sp,st},{st,sp,st}},//n
            {{sp,sp,sp},{st,st,st},{st,sp,st},{st,st,st}},//o
            {{st,st,st},{st,sp,st},{st,st,st},{st,sp,sp}},//p
            {{st,st,sp},{st,st,sp},{st,st,sp},{sp,sp,st}},//q
            {{st,st,st},{st,sp,st},{st,st,sp},{st,sp,st}},//r
            {{sp,st,st},{st,sp,sp},{sp,st,st},{st,st,sp}},//s
            {{st,st,st},{sp,st,sp},{sp,st,sp},{sp,st,sp}},//t
            {{st,sp,st},{st,sp,st},{st,sp,st},{st,st,st}},//u
            {{st,sp,st},{st,sp,st},{st,sp,st},{sp,st,sp}},//v
            {{st,sp,st},{st,sp,st},{st,st,st},{st,sp,st}},//w
            {{st,sp,st},{sp,st,sp},{sp,st,sp},{st,sp,st}},//x
            {{st,sp,st},{st,st,st},{sp,sp,st},{sp,sp,st}},//y
            {{st,st,st},{sp,st,sp},{st,sp,sp},{st,st,st}},//z
            {{sp,sp,sp},{sp,sp,sp},{sp,sp,sp},{sp,sp,sp}}//' '
        };
    public String[][][] numerics = {
        {},//0
        {},//1
        {},//2
        {},//3
        {},//4
        {},//5
        {},
        {},
        {},
        {},
        {}
        };
    public Screen(int xWidth,int yWidth){
        screen = new String[yWidth][xWidth];
        //w = xWidth;
        he = yWidth;
        for(int i = 0; i<screen.length;i++){
            for(int j = 0;j<screen[i].length;j++){
                screen[i][j] = " ";
            }
        }

    }
    void overlay(String[][] blit){
        for(int i = 0; i<screen.length;i++){
            for(int j = 0;j<screen[i].length;j++){
                if(!blit[i][j].equals(" ")){
                    screen[i][j] = blit[i][j];
                }
            }
        }
    }
    void text(String input ,int x1,int y1){
        input = input.toUpperCase();
        for(int i = 0; i<input.length();i++){
            char charofinp = input.charAt(i);
            int ascii;
            if(charofinp !=' '){
                ascii  = (int)charofinp-65;
            }else{
                ascii = 26;
            }
            for(int j = 0;j<alpha[ascii].length;j++){
                for(int k = 0;k<alpha[ascii][j].length;k++){
                    this.add((i*4)+x1+k,y1+j,alpha[ascii][j][k]);
                }
            }
        }
    }
    void add(int x,int y,String st){
        try{
            screen[y][x] = st;
        }catch(Exception E){
        }
    }
    void display(){
        //clearconsole
        System.out.print('\u000C');

        for(int i = 0; i<screen.length;i++){
            for(int j = 0;j<screen[i].length;j++){
                System.out.print(screen[i][j]+' ');
            }
            System.out.println();
        }

        //clearscreen
        for(int i = 0; i<screen.length;i++){
            for(int j = 0;j<screen[i].length;j++){
                screen[i][j] = " ";
            }
        }
    }
}