import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class game {
    static void main()throws InterruptedException{
        //Screen screen = new Screen(20,20);      
        Grid grid = new Grid();
        Thread.sleep(20*1000);
        GoLLY g = new GoLLY(grid);
        int x=0,y=0;
        boolean running = true;
        boolean paused = false;
        int fps=10;
        while(running){
            Thread.sleep((int)1000/fps);
            if(!paused){
                g.display();
                g.playGod();
                g.update();
            }else{
                //TODO: pause feature
            }
            //grid.main();
        }
    }
}