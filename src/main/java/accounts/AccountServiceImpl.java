package accounts;

import base.AccountService;
import base.UserProfile;

import java.util.HashMap;
import java.util.Map;

public class AccountServiceImpl implements AccountService {
    private final Map<String, UserProfile> sessionIdToProfile;

    public AccountServiceImpl() {
        sessionIdToProfile = new HashMap<>();
    }

    public UserProfile getUser(String sessionId) {
        return sessionIdToProfile.get(sessionId);
    }

    public void addSession(String sessionId, UserProfile userProfile) {
        sessionIdToProfile.put(sessionId, userProfile);
    }

    public void removeSession(String sessionId) {
        sessionIdToProfile.remove(sessionId);
    }
}
