package be.ythibos.twaattin.authentication;

import java.security.Principal;

/**
 * Created by Yannick Thibos.
 */
public class SimpleUserPassAuthenticationStrategy {

    private static final long serialVersionUID = 1L;

    private SimpleUserPassAuthenticationStrategy() {}

    public static Principal authenticate(String login, String password) throws AuthenticatonException {

        if ("admin".equals(login) && "admin".equals(password)) {
            return () -> login;
        }
        else {
            throw new AuthenticatonException("Incorrect user/password combination.");
        }

    }
}
