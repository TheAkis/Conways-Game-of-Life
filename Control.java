import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class Control{
    static JFrame frame;
    public boolean pause=true;
    public int fps = 5;
    public Control(){
        frame = new JFrame("Control Menu");
        JButton pausebutton = new JButton("►");
        JSlider generationspeed = new JSlider(0,20,fps);
        JButton exitbutton = new JButton("Exit");
        generationspeed.addChangeListener(new ChangeListener()
        {
            public void stateChanged(ChangeEvent e){
                int temp = generationspeed.getValue();
                if(temp==0){
                    generationspeed.setValue(1);
                    fps = 1;
                }else{
                    fps = generationspeed.getValue();
                }
            }
        });
        
        generationspeed.setMajorTickSpacing(10);
        generationspeed.setMinorTickSpacing(1);
        generationspeed.setPaintTicks(true);
        generationspeed.setPaintLabels(true);
        exitbutton.setFocusable(false);
        pausebutton.setFocusable(false);
        pausebutton.addActionListener(new ActionListener()
        {
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
        exitbutton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                System.exit(0);
                }
            }
        );
        frame.setLayout(null);
        frame.getContentPane().setLayout(new FlowLayout());      
        frame.add(pausebutton);
        frame.add(exitbutton);
        frame.add(generationspeed);
        frame.setPreferredSize(new Dimension(300, 100));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}