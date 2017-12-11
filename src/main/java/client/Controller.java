package client;

import java.awt.*;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        initView();
    }

    public void initView(){
        view.newGameScreen();

    }

    public void initController(){
        view.getNewgame().addActionListener(e -> initRegisterPlayerView()); //using lambdas to have nice and short code :)
    }

    public void initRegisterPlayerView(){
        view.playerDataScreen();
    }

}
