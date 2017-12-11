package client;

import java.awt.*;
import javax.swing.*;


public class View {
    private GamewindowJFrame gamewindow;
    private JButton newgame = new JButton("New Game");
    private JButton exit = new JButton("Exit");
    private JButton registerplayer;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField age;
    private JTextField nickname;
    private JLabel firstnamelabel;
    private JLabel lastnamelabel;
    private JLabel agelabel;
    private JLabel nicknamelabel;
    private Container base;

    public View(){
        gamewindow = new GamewindowJFrame();  //creating the gamewindow with extended jframe class
        base = gamewindow.getContentPane();
        base.setLayout(new FlowLayout());
    }

    public void newGameScreen(){
        /*gamewindow.add(newgame);
        gamewindow.add(exit);
        gamewindow.pack();
        */
        base.add(newgame);
        base.add(exit);
        gamewindow.pack();
    }

    public void playerDataScreen(){
        this.firstname = new JTextField(10);
        this.firstnamelabel = new JLabel("FirstName:");
        this.lastname = new JTextField(10);
        this.lastnamelabel = new JLabel("LastName:");

        base.remove(newgame);
        base.remove(exit);
        base.add(firstnamelabel);
        base.add(firstname);

        gamewindow.pack();
        //gamewindow.repaint();
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

    public void setNicknamelabel(JLabel nicknamelabel) {
        this.nicknamelabel = nicknamelabel;
    }
}
