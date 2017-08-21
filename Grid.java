import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Grid extends JFrame implements ActionListener{
    private Container contents;
    int width,height,w;
    JButton[][] GridSquares;
    public Grid(int wid, int h,int s){
        width = wid;
        height = h;
        w = s;
        
        GridSquares = new JButton[height][width];
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
                    GridSquares[i][j].setBackground((GridSquares[i][j].getBackground()==Color.yellow)?null:Color.yellow);
                }
            }
        }
    }
}