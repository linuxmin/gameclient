package client;

import javax.swing.*;
import java.awt.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GamewindowJFrame extends JFrame {
    private static final Logger LOGGER = LogManager.getLogger(GamewindowJFrame.class);

    /*
    extending the standard jframe of swing to preferred settings.
     */
    GamewindowJFrame(){
        this.setSize(1024,768);
        this.setVisible(true);
        this.setTitle("I love SWE deep and hard!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close window when clicked on X
        LOGGER.info(this.getSize().toString());
    }
}
