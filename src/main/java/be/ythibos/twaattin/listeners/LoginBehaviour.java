package be.ythibos.twaattin.listeners;

import be.ythibos.twaattin.authentication.AuthenticatonException;
import be.ythibos.twaattin.authentication.SimpleUserPassAuthenticationStrategy;
import be.ythibos.twaattin.screens.TimelineScreen;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.*;

import java.security.Principal;

import static com.vaadin.ui.Notification.Type.WARNING_MESSAGE;

/**
 * Created by Yannick Thibos.
 */
public class LoginBehaviour implements Button.ClickListener {

    private static final long serialVersionUID = 1L;

    private final TextField loginField;
    private final PasswordField passwordField;

    public LoginBehaviour(TextField loginField, PasswordField passwordField) {

        this.loginField = loginField;
        this.passwordField = passwordField;

    }

    @Override
    public void buttonClick(Button.ClickEvent event) {

        String login = loginField.getValue();
        String password = passwordField.getValue();

        Principal user;
        try {
            user = SimpleUserPassAuthenticationStrategy.authenticate(login, password);

            VaadinSession.getCurrent().setAttribute(Principal.class, user);

            UI.getCurrent().setContent(new TimelineScreen());
            Notification.show("Login succesful");
        } catch (AuthenticatonException e) {
            Notification.show(e.getMessage(), WARNING_MESSAGE);
        }



    }
}
