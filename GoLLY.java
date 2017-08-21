import java.awt.*;
public class GoLLY
{
    public Grid grid;
    public Cell[][] cells;
    public GoLLY(Grid obj)
    {
        grid = obj;
        cells = new Cell[grid.height][grid.width];
        for(int i=0;i<cells.length;i++){
            for(int j=0;j<cells[i].length;j++){
                cells[i][j] = new Cell(j,i,grid.GridSquares[i][j]);
            }
        }
    }
    
    void getGrid(){
        for(int i=0;i<cells.length;i++){
            for(int j=0;j<cells[i].length;j++){
                cells[i][j].alive = grid.GridSquares[i][j].getBackground()==Color.yellow ;
            }
        }
    }

    int checkNeighbours(int x,int y){
        int neighbours=0;
        for(int i=y-1;i<=y+1;i++){
            for(int j=x-1;j<=x+1;j++){
                if((!(i<0))&&(!(i>cells.length-1))&&(!(j<0))&&(!(j>cells[0].length-1))){
                    if(i!=y||j!=x){
                        if(cells[i][j].alive){
                            neighbours++;
                        }
                    }
                }
            }
        }       
        return neighbours;
    }

    void applyChanges(){
        for(int i =0;i<cells.length;i++){
            for(int j=0;j<cells[i].length;j++){
                int neighbours = checkNeighbours(j,i);
                cells[i][j].passNeighbours(neighbours);
                if((!cells[i][j].alive)&&neighbours==3){
                    cells[i][j].updateStatus(true);
                }else if(cells[i][j].alive){
                    if(neighbours<2){
                        cells[i][j].updateStatus(false);
                    }else if(neighbours==2||neighbours==3){
                        cells[i][j].updateStatus(true);
                    }else if(neighbours>=4){
                        cells[i][j].updateStatus(false);
                    }
                }
            }
        }
    }

    void update(){
        for(int i =0;i<cells.length;i++){
            for(int j=0;j<cells[i].length;j++){
                cells[i][j].update();
            }
        }
    }

    void display(){
        for(int i=0;i<cells.length;i++){
            for(int j=0;j<cells[i].length;j++){
                cells[i][j].display();
            }
        }
    }
}
