package mainPackage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.File;
import java.io.IOException;

/**
 * Created by Fabian on 2018-10-23.
 */
public class GameObjectImplementation implements GameObject {
    boolean drawField = true;
    @Override
    public void render(Graphics g) {
        if (drawField) {

            Image img = null;
            try {
                ImageIO.read(new File("res/field.gif"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            drawField =false;
            g.drawRect(10,10,100,100);

        } else {
            Image img = null;
            try {
                ImageIO.read(new File("res/logo.gif"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            drawField =true;
            g.drawRect(100,100,100,100);
        }
        return;

    }
}
