package be.ythibos.twaattin.screens;

import be.ythibos.twaattin.listeners.LoginBehaviour;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;

/**
 * Created by Yannick Thibos.
 */
public class LoginScreen extends FormLayout {

    private static final long serialVersionUID = 1L;

    private TextField loginField = new TextField("Login");
    private PasswordField passwordField = new PasswordField("Password");
    private Button submitButton = new Button("Submit");

    public LoginScreen () {

        setMargin(true);

        submitButton.addClickListener(new LoginBehaviour(loginField, passwordField));

        addComponent(loginField);
        addComponent(passwordField);
        addComponent(submitButton);



    }

}
