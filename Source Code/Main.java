
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_Hotal Reservation System_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-\n");
        int choice;
        Scanner sc = new Scanner (System.in);
        User user= new User();
        DatabaseUser db = new DatabaseUser();
        db.BackendData();
        while(true){
            System.out.println();
            System.out.println(" 1: Create Account");
            System.out.println(" 2: Login Account");
            System.out.println(" 3: Exit");
            System.out.print("\n -> Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    user.CreateAccount(db);
                    System.exit(0);
                    break;
                case 2:
                    user.login(db);
                    System.exit(0);
                    break;
                case 3:
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
