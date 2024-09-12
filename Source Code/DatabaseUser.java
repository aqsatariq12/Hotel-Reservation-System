
import java.util.ArrayList;

public class DatabaseUser {
    private String username;
    private String password;
    protected ArrayList<DatabaseUser> user = new ArrayList<>();
    DatabaseUser(){}
    DatabaseUser(String username, String password){
        this.username = username;
        this.password= password;
    }
    public void setUsername(String uname){
        this.username = uname;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    public String getPassword(){
        return password;
    }
    public ArrayList<DatabaseUser> getUserList(){
        return user;
    }
    
        //You can also feth data from database
    public void BackendData(){
        user.add(new DatabaseUser("Aqsa","aqsa123"));
        user.add(new DatabaseUser("Laiba","11laiba"));
        user.add(new DatabaseUser("Saad","saad150"));
        user.add(new DatabaseUser("Hamza","hamza1122"));
    }

        //This display function is used by Administrator to see all the account holder-->not used in this project
    public void display(){
        int count = 0;
        for (DatabaseUser customer : user){
            System.out.println("-----Record-----"+(++count));
            System.out.println("Name = "+customer.getUsername());
            System.out.println("Password = "+customer.getPassword());
        }
    }
}
