package client;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViewTest {

    @Test
    public void newGameScreen() throws Exception {

    }

    @Test
    public void playerNoScreen() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        view.playerNoScreen();
        assertEquals(true,view.getPlayerone().isVisible());
        assertEquals(true,view.getPlayertwo().isVisible());

    }

    @Test
    public void playerDataScreen() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        view.playerDataScreen();
        assertEquals(9,view.getBase().getComponentCount());
    }


    @Test
    public void getPlayerone() throws Exception {
    }

    @Test
    public void setPlayerone() throws Exception {
    }

    @Test
    public void getPlayertwo() throws Exception {
    }

    @Test
    public void setPlayertwo() throws Exception {
    }

    @Test
    public void getBase() throws Exception {
    }

    @Test
    public void setBase() throws Exception {
    }

    @Test
    public void getGamewindow() throws Exception {
    }

    @Test
    public void setGamewindow() throws Exception {
    }

    @Test
    public void getNewgame() throws Exception {
    }

    @Test
    public void setNewgame() throws Exception {
    }

    @Test
    public void getExit() throws Exception {
    }

    @Test
    public void setExit() throws Exception {
    }

    @Test
    public void getRegisterplayer() throws Exception {
    }

    @Test
    public void setRegisterplayer() throws Exception {
    }

    @Test
    public void getFirstname() throws Exception {
    }

    @Test
    public void setFirstname() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        view.playerDataScreen();
        view.getFirstname().setText("Harald");
        assertEquals("Harald",view.getFirstname().getText());
    }

    @Test
    public void getLastname() throws Exception {
    }

    @Test
    public void setLastname() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        view.playerDataScreen();
        view.getLastname().setText("Hartmann");
        assertEquals("Hartmann",view.getLastname().getText());
    }

    @Test
    public void getAge() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        view.playerDataScreen();
        view.getAge().setText("12");
        assertEquals("12",view.getAge().getText());
    }

    @Test
    public void setAge() throws Exception {


    }

    @Test
    public void getNickname() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        view.playerDataScreen();
        view.getNickname().setText("Harti");
        assertEquals("Harti",view.getNickname().getText());
    }

    @Test
    public void setNickname() throws Exception {
    }

    @Test
    public void getFirstnamelabel() throws Exception {
    }

    @Test
    public void setFirstnamelabel() throws Exception {
    }

    @Test
    public void getLastnamelabel() throws Exception {
    }

    @Test
    public void setLastnamelabel() throws Exception {
    }

    @Test
    public void getAgelabel() throws Exception {
    }

    @Test
    public void setAgelabel() throws Exception {
    }

    @Test
    public void getNicknamelabel() throws Exception {
    }

    @Test
    public void getMove() throws Exception {
    }

    @Test
    public void setMove() throws Exception {
    }

    @Test
    public void getGamestatus() throws Exception {
    }

    @Test
    public void setGamestatus() throws Exception {
    }

    @Test
    public void setNicknamelabel() throws Exception {
    }

}