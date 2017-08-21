public class GoL{
    static void main() throws InterruptedException{   
        Grid grid = new Grid(60,50,20);
        Control control = new Control();
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