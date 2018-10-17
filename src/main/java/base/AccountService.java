package base;

public interface AccountService {
    public UserProfile getUser(String sessionId);
    public void addSession(String sessionId, UserProfile userProfile);
    public void removeSession(String sessionId);
}
