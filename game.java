import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class game {
    static void main()throws InterruptedException{
        //Screen screen = new Screen(20,20);      
        Grid grid = new Grid();
        Pause pause = new Pause();
        Thread.sleep(5*1000);
        GoLLY g = new GoLLY(grid);
        int x=0,y=0;
        boolean running = true;
        int fps=3;
        while(running){
            Thread.sleep((int)1000/fps);
            if(!pause.pause){
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