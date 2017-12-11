package client;

public class TestView {
    public static void main(final String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        controller.initView();
        controller.initController();
    }
}
