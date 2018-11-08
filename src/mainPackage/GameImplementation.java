package mainPackage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

class GameImplementation extends Game {
    GameObjectImplementation g;
    GameImplementation() {
        g = new GameObjectImplementation();
    }
    boolean returnField = true;

    @Override
    public Collection<GameObject> getGraphics() {
        LinkedList<GameObject> list = new LinkedList<>();
        list.add(g);
        return list;
    }

    @Override
    public void keyTyped(KeyEvent key) {

    }

}
