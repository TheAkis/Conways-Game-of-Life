import java.awt.*;
import javax.swing.*;
public class Cell
{
    public boolean alive = false;
    public boolean pipeline = false;
    public int x;
    public int y;
    public int neighbours=0;
    public JButton button; 
    public Cell(int i,int j,JButton obj){
        button = obj;
        x = i;
        y = j;
    }

    void updateStatus(boolean b){
        pipeline = b;
    }

    void passNeighbours(int n){
        neighbours = n;
    }

    void update(){
        alive = pipeline;
    }

    void display(){
        if(alive){
            button.setBackground(Color.yellow);
        }else{
            button.setBackground(null);
        }
    }
}
