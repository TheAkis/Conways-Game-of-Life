import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Grid{
    public JFrame frame;
    public JPanel panel;
    //public JPanel panel;
    int width,height,w;
    JButton[][] GridSquares;
    public Grid(int wid, int h,int s){
        frame = new JFrame();
        panel = new JPanel();
        panel = new JPanel();
        
        frame.setLayout(new BoxLayout(frame.getContentPane(),BoxLayout.X_AXIS));
        //panel.setLayout(new BorderLayout());
        
        
        
        
        width = wid;
        height = h;
        w = s;
        GridSquares = new JButton[height][width];
        panel.setLayout(new GridLayout(height,width));
 
        
        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                GridSquares[i][j]=new JButton();
                GridSquares[i][j].addActionListener(new ActionListener(){
                     public void actionPerformed(ActionEvent e){
                         JButton source = ((JButton)e.getSource());
                         source.setBackground((source.getBackground()==Color.yellow)?null:Color.yellow);
                     }
                });
                panel.add(GridSquares[i][j]);
            }
        }
        
        //panel.add(panel,BorderLayout.NORTH);
        frame.add(panel);//,BorderLayout.WEST);
        
        
        frame.setSize(width*w,height*w);
        frame.setVisible(true);
        
    }
    
    JFrame getFrame(){
        return frame;
    }


    public static void main(){
        Grid grid = new Grid(20,20,20);
    }
}