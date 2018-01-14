package client;

import java.util.List;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.plugins.util.ResolverUtil;


public class TestView {
    private static final Logger LOGGER = LogManager.getLogger(TestView.class);

    public static void main(final String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);
        LOGGER.info(controller);
        controller.initView();
        controller.initController();


    }
}
