package ro.razvan.githubproject.control;

import javax.inject.Inject;

public class NetworkAPI {

    @Inject
    public NetworkAPI() {
    }

    public final boolean validateUser(final String username, final String password) {
        return username != null && username.length() != 0;
    }
}
