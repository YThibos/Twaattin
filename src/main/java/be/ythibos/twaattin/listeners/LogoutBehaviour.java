package be.ythibos.twaattin.listeners;

import be.ythibos.twaattin.screens.LoginScreen;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;

import java.security.Principal;

/**
 * Created by Yannick Thibos.
 */
public class LogoutBehaviour implements Button.ClickListener {

    private static final long serialVersionUID = 1L;

    @Override
    public void buttonClick(Button.ClickEvent event) {

        VaadinSession.getCurrent().setAttribute(Principal.class, null);

        UI.getCurrent().setContent(new LoginScreen());

        Notification.show("Logged out.", Notification.Type.WARNING_MESSAGE);

    }
}
