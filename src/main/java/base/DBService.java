package base;

public interface DBService {
    String hibernate_show_sql = "false";
    String hibernate_hbm2ddl_auto = "update";
    String hibernate_url = "jdbc:h2:./h2db";
    String hibernate_username = "test";
    String hibernate_password = "test";

    public UserProfile getUser(long id) throws DBException;
    public UserProfile getUser(String login) throws DBException;
    public long addUser(String login, String password) throws DBException;

    public void printConnectInfo();
}
