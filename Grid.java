import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Grid extends JFrame implements ActionListener{
    private Container contents;
    int w = 20;
    int width = 50;
    int height = 50;
    JButton[][] GridSquares = new JButton[height][width];
    int cols,rows;
    public Grid(){
        contents= getContentPane();
        contents.setLayout(new GridLayout(height,width));
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                GridSquares[i][j]=new JButton();
                contents.add(GridSquares[i][j]);
                GridSquares[i][j].addActionListener(this);
            }
        }
        setSize(width*w,height*w);
        setVisible(true);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(source==GridSquares[i][j]){
                    GridSquares[i][j].setBackground(Color.yellow);
                }
            }
        }
    }

    void setAliveStatus(int x,int y,boolean alive){
        if(alive){
            GridSquares[x][y].setBackground(Color.yellow);
        }else{
            GridSquares[x][y].setBackground(null);
        }
    }

    public static void main(String args[]){
        new Grid();
    }
}