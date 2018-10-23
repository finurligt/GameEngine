package mainPackage;


import java.util.Collection;

/**
 * Created by Fabian on 2018-10-23.
 */
public class Implementation {
    public static void main(String[] args) {
        Game game = new GameImplementation();
        Window window = new Window(game,640,480);
        window.run();
    }


}
