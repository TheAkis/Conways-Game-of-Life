import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pause{
    static JFrame frame;
    public boolean pause=false;
    public Pause(){
        frame = new JFrame("Control Menu");
        JButton pausebutton = new JButton("❚❚");
        pausebutton.setFocusable(false);
        pausebutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                pause = !pause;
                if(pause){
                    pausebutton.setText("►");
                }else{
                    pausebutton.setText("❚❚");
                }
                }
            }
        );

        frame.getContentPane().setLayout(new FlowLayout());
        frame.add(pausebutton);
        //frame.setPreferredSize(new Dimension(300, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}