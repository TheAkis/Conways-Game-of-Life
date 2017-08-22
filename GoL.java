import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GoL{
    static void main() throws InterruptedException{   
        Grid grid = new Grid(50,50,10);
        Control control = new Control(grid.getFrame());
        GoLLY board = new GoLLY(grid);
        boolean running = true;
        while(running){
            Thread.sleep((int)1000/control.fps);
            if(!control.pause){
                board.display();
                board.applyChanges();
                board.update();
            }else{
                board.getGrid();
            }
        }
    }
}