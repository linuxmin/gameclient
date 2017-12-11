package client;

import javax.swing.*;
import java.awt.*;

public class GamewindowJFrame extends JFrame {
    /*
    extending the standard jframe of swing to preferred settings.
     */
    GamewindowJFrame(){
        this.setSize(1024,768);
        this.setVisible(true);
        this.setTitle("I love SWE deep and hard!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //to close window when clicked on X

    }
}
