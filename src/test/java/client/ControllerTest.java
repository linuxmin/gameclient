package client;

import org.junit.Test;

import java.awt.event.ActionListener;

import static org.junit.Assert.*;

public class ControllerTest {
    @Test
    public void initView() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        assertEquals(2,view.getBase().getComponentCount());
    }

    @Test
    public void initController() throws Exception {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        String listener = "java.awt.event.ActionListener[]";
        assertEquals(listener,view.getBase().getListeners(ActionListener.class).getClass().getTypeName().toString());
    }

    @Test
    public void initMapGeneration() throws Exception {

    }

    @Test
    public void initMapView() throws Exception {

    }

    @Test
    public void initReadyGameView() throws Exception {
    }

    @Test
    public void initRegisterPlayerViewOne() throws Exception {



    }

    @Test
    public void initRegisterPlayerViewTwo() throws Exception {
    }

    @Test
    public void initPlayerNoView() throws Exception {
    }

}