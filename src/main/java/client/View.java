package client;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class View {
    private static final Logger LOGGER = LogManager.getLogger(View.class);

    private GamewindowJFrame gamewindow;
    private JButton newgame = new JButton("New Game");
    private JButton exit = new JButton("Exit");
    private JButton playerone = new JButton("Player 1");
    private JButton playertwo = new JButton("Player 2");
    private JButton registerplayer = new JButton("RegisterPlayer");
    private JButton move = new JButton("move");
    private JTextField firstname;
    private JTextField lastname;
    private JTextField age;
    private JTextField nickname;
    private JLabel firstnamelabel;
    private JLabel lastnamelabel;
    private JLabel agelabel;
    private JLabel nicknamelabel;
    private JLabel gamestatus;
    private JPanel base;
   /* private ImageIcon grassIcon = new ImageIcon("/home/linuxmin/gameclient/src/main/resources/grass.png");
    private ImageIcon mountainIcon = new ImageIcon("/home/linuxmin/gameclient/src/main/resources/mountain.png");
    private ImageIcon waterIcon = new ImageIcon("/home/linuxmin/gameclient/src/main/resources/water.png");
    private ImageIcon playerIcon = new ImageIcon("/home/linuxmin/gameclient/src/main/resources/player.png");
    private ImageIcon opponentIcon = new ImageIcon("/home/linuxmin/gameclient/src/main/resources/opponent.png");
*/
    public View(){
        gamewindow = new GamewindowJFrame();  //creating the gamewindow with extended jframe class
        /*
        initialise and set the layout where the content will be added and removed dynamically
         */
        base = new JPanel();
        gamewindow.getContentPane().add(base);
        base.setLayout(new GridLayout(8,8));
        LOGGER.info(base.getLayout().toString());
    }

    public void initPlayView(GameView gameView){
        base.removeAll();
        base.setLayout(null);
        gamewindow.setSize(800,800);
        base.add(gameView);
        base.revalidate();
        base.repaint();
        LOGGER.info(gamewindow.getSize().toString());

    }

    public void newGameScreen(){
        base.removeAll();
        base.add(newgame);  //add adds new content to the layout
        base.add(exit);
        gamewindow.pack();   // getting the window resized from system (used to refresh also)
    }

    public void playerNoScreen(){
        base.removeAll(); //removes content from the layout
        base.add(playerone);
        base.add(playertwo);
        gamewindow.pack();
    }

    public void playerDataScreen(){
        base.removeAll();
        this.firstname = new JTextField(10);
        this.firstnamelabel = new JLabel("FirstName:");
        this.lastname = new JTextField(10);
        this.lastnamelabel = new JLabel("LastName:");
        this.age = new JTextField(5);
        this.agelabel = new JLabel("Age");
        this.nickname = new JTextField(10);
        this.nicknamelabel = new JLabel("Nickname");
       // this.registerplayer = new JButton("Register");

        base.add(firstnamelabel);
        base.add(firstname);
        base.add(lastnamelabel);
        base.add(lastname);
        base.add(agelabel);
        base.add(age);
        base.add(nicknamelabel);
        base.add(nickname);
        base.add(registerplayer);
        gamewindow.pack();
        LOGGER.info(base.getComponentCount());
    }

    public void readyGameScreen(){
        base.removeAll();
        this.gamestatus = new JLabel("Waiting for second Player to start Game");
        base.add(gamestatus);
        gamewindow.pack();
    }





    public JButton getPlayerone() {
        return playerone;
    }

    public void setPlayerone(JButton playerone) {
        this.playerone = playerone;
    }

    public JButton getPlayertwo() {
        return playertwo;
    }

    public void setPlayertwo(JButton playertwo) {
        this.playertwo = playertwo;
    }

    public Container getBase() {
        return base;
    }

    public void setBase(JPanel base) {
        this.base = base;
    }

    public GamewindowJFrame getGamewindow() {
        return gamewindow;
    }

    public void setGamewindow(GamewindowJFrame gamewindow) {
        this.gamewindow = gamewindow;
    }

    public JButton getNewgame() {
        return newgame;
    }

    public void setNewgame(JButton newgame) {
        this.newgame = newgame;
    }

    public JButton getExit() {
        return exit;
    }

    public void setExit(JButton exit) {
        this.exit = exit;
    }

    public JButton getRegisterplayer() {
        return registerplayer;
    }

    public void setRegisterplayer(JButton registerplayer) {
        this.registerplayer = registerplayer;
    }

    public JTextField getFirstname() {
        return firstname;
    }

    public void setFirstname(JTextField firstname) {
        this.firstname = firstname;
    }

    public JTextField getLastname() {
        return lastname;
    }

    public void setLastname(JTextField lastname) {
        this.lastname = lastname;
    }

    public JTextField getAge() {
        return age;
    }

    public void setAge(JTextField age) {
        this.age = age;
    }

    public JTextField getNickname() {
        return nickname;
    }

    public void setNickname(JTextField nickname) {
        this.nickname = nickname;
    }

    public JLabel getFirstnamelabel() {
        return firstnamelabel;
    }

    public void setFirstnamelabel(JLabel firstnamelabel) {
        this.firstnamelabel = firstnamelabel;
    }

    public JLabel getLastnamelabel() {
        return lastnamelabel;
    }

    public void setLastnamelabel(JLabel lastnamelabel) {
        this.lastnamelabel = lastnamelabel;
    }

    public JLabel getAgelabel() {
        return agelabel;
    }

    public void setAgelabel(JLabel agelabel) {
        this.agelabel = agelabel;
    }

    public JLabel getNicknamelabel() {
        return nicknamelabel;
    }

    public JButton getMove() {
        return move;
    }

    public void setMove(JButton move) {
        this.move = move;
    }

    public JLabel getGamestatus() {
        return gamestatus;
    }

    public void setGamestatus(JLabel gamestatus) {
        this.gamestatus = gamestatus;
    }

    public void setNicknamelabel(JLabel nicknamelabel) {
        this.nicknamelabel = nicknamelabel;
    }
}
