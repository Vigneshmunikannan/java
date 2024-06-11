package classes;
import java.util.*;
public class UserManager{
    private static UserManager instance;
    private boolean loggedInUser=false;
    private HashMap<String, User> users;
    private User loggedUser;

    private UserManager() {
        this.users = new HashMap<>();
    }
    
    public User getuser(){
     return loggedUser;
    }

    public static UserManager getInstance() {
        if (instance == null) {
            instance = new UserManager();
        }
        return instance;
    }

    public String registerUser(String username, String password) {
        if(loggedInUser){
            return "Log out previous user";
        }
        username = username.trim();
        if (username.isEmpty() || password.isEmpty()) {
            return "Enter all details properly";
        }
    
        if (users.containsKey(username)) {
            return "Username already exists"; // User already exists
        }
        users.put(username, new User(username, password));
        return "User created successfully";
    }
    

    public String loginUser(String username, String password) {
        if(loggedInUser){
            return "Log out previous user";
        }
        username = username.trim();
        if (users.containsKey(username)) {
            User user = u   
            if (user.getPassword().equals(password)) {
                loggedInUser=true;
                loggedUser=user;
                return "Login successful.";
            }
        }
        return "Invalid username or password.";
    }
    public String logoutUser() {
        if (loggedInUser == false) {
            return "No user is currently logged in.";
        }
        loggedInUser=false;
        loggedUser=null;
        return "Logout successful.";
    }

}
