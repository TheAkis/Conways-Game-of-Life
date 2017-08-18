import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class game {
    static void main()throws InterruptedException{
        //Screen screen = new Screen(20,20);      
        Grid grid = new Grid();
        Control control = new Control();
        GoLLY g = new GoLLY(grid);
        boolean running = true;
        while(running){
            Thread.sleep((int)1000/control.fps);
            if(!control.pause){
                g.display();
                g.playGod();
                g.update();
            }else{
                g.getGrid();
            }
            //grid.main();
        }
    }
}