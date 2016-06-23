package be.ythibos.twaattin;

import be.ythibos.twaattin.screens.LoginScreen;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.UI;

import javax.servlet.annotation.WebServlet;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>d
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("valo")
@Widgetset("be.ythibos.MyAppWidgetset")
@Title("Twaattin")
public class TwaattinUI extends UI {

    private static final long serialVersionUID = 1L;

    @Override
    protected void init(VaadinRequest vaadinRequest) {

        setContent(new LoginScreen());

/*        HorizontalSplitPanel horizontalSplitPanel = new HorizontalSplitPanel();

        horizontalSplitPanel.setFirstComponent(new LoginScreen());
        horizontalSplitPanel.setSecondComponent(new TimelineScreen());
        horizontalSplitPanel.setSplitPosition(400, PIXELS);
        horizontalSplitPanel.setLocked(true);

        setContent(horizontalSplitPanel);*/
    }

    @WebServlet(urlPatterns = {"/twaattin/*", "/VAADIN/*"}, name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = TwaattinUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
