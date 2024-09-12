import java.util.ArrayList;
import java.util.Scanner;

public class User extends DatabaseUser {
    private String username;
    private String password;
    Scanner sc = new Scanner(System.in);

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

        public void CreateAccount(DatabaseUser user){
            ArrayList<DatabaseUser> db = user.getUserList();
            boolean tryagain = false;
            String permission;
            String checkPass;
            System.out.println("\n------Account Cretion------\n");
            System.out.print("-> Enter User name : ");
            username = sc.nextLine();


            System.out.print("-> Enter password : ");
            password = sc.nextLine();

            System.out.print("-> Enter password again : ");
            checkPass = sc.nextLine();

            if(password.equals(checkPass)){
                db.add(new DatabaseUser(username, password));
                System.out.println("\n   Account Created Succesfully!"); 
                tryagain = true;
                this.Operation();
            }
            else if (tryagain == false){
                System.out.println("\n  incorrect password!\n");
                    System.out.print("\n Try again? y/n : ");
                    permission = sc.next();
                    sc.nextLine();
                    while (true) {
                        if (permission.equals("y") || permission.equals("yes")){
                        CreateAccount(user);
                        break;
                        }
                        else{
                            return;
                        }
                    }
            }
            else {
                
            }
            

        }
    public void login(DatabaseUser user){
        ArrayList<DatabaseUser> db = user.getUserList();
        String permission;
        System.out.println("\n------LOGIN------\n");
        System.out.print("-> User name : ");
        username = sc.nextLine();
        
        System.out.print("-> Password : ");
        password = sc.nextLine();
        
         boolean isvalid=false;
         
        for(DatabaseUser cust: db){
            if(cust.getUsername().equals(this.username) && cust.getPassword().equals(this.password))
            isvalid = true;
        }
        if(isvalid){
            System.out.println("\n Login succesfully");
            this.Operation();
        }
        else{
            System.out.println("\n Invalid Username or Password");
        }
        if(isvalid == false){
            System.out.print("\n login again? y/n : ");
            permission = sc.next();
            sc.nextLine();
        while (true) {
                if (permission.equals("y") || permission.equals("yes")){
                login(user);
                break;
                }
                else{
                    return;
                }
            }
        }
    }

    public void Operation(){
        
        System.out.println("\n\t   ------------------WELCOME USER!------------------\n");
        int choice;
        Hotel hotel = new Hotel();
        while(true){

            System.out.println("\n.............................................................\n");
            System.out.println("1: Check Available Rooms");
            System.out.println("2: Make a reservation");
            System.out.println("3: Reservation Details");
            System.out.println("4: exit");
            System.out.println("\n.............................................................\n");

            System.out.print("-> Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    hotel.displayRooms();
                    break;
                case 2:
                    hotel.Reservation();
                    break;
                case 3:
                    hotel.Details();
                    break;
                case 4:
                    System.out.println("\n Thank You!\n");
                    sc.close();                    
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

        }
    }
}
