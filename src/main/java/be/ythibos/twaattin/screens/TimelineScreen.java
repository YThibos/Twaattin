package be.ythibos.twaattin.screens;

import be.ythibos.twaattin.listeners.LoginBehaviour;
import be.ythibos.twaattin.listeners.LogoutBehaviour;
import com.vaadin.server.VaadinSession;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;

import java.security.Principal;

/**
 * Created by Yannick Thibos.
 */
public class TimelineScreen extends VerticalLayout {

    private static final long serialVersionUID = 1L;

    public TimelineScreen() {

        Label currentUser = new Label(VaadinSession.getCurrent().getAttribute(Principal.class).getName());
        Button logoutButton = new Button("Log out");
        logoutButton.addClickListener(new LogoutBehaviour());

        HorizontalLayout menuBar = new HorizontalLayout(currentUser, logoutButton);

        addComponent(menuBar);

        setMargin(true);
        fillTweets();
    }

    private void fillTweets() {
        for (int i = 0; i < 10; i++) {
            Label tweet = new Label();

            tweet.setValue("Lorem ipsum dolor sit amet, consectetur "
                    + "adipisicing elit, sed do eiusmod tempor incididunt "
                    + "ut labore et dolore magna aliqua. Ut enim ad minim "
                    + "veniam, quis nostrud exercitation ullamco laboris "
                    + "nisi ut aliquip ex ea commodo consequat.");
            addComponent(tweet);
        }
    }

}
