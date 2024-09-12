
import java.util.ArrayList;
import java.util.Scanner;

public class Hotel {
    int roomNo;
    String view;
    int numBads;
    double price;
    ArrayList<Hotel> room = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Hotel(){
        room.add(new Hotel(286,"Ocean view",2, 399.00));
        room.add(new Hotel(117,"Garden view",1,101.15));
        room.add(new Hotel(19,"City view",4,45.00));
        room.add(new Hotel(201,"river view",2, 300.15));
        room.add(new Hotel(11,"Mountain view",3, 55.00));
        room.add(new Hotel(48,"Pool view",2,60.15));
        room.add(new Hotel(90,"Street view",1,25.15));
        room.add(new Hotel(99,"Courtyard view",6,83.18));
        room.add(new Hotel(221,"no view",4,33.15));
        room.add(new Hotel(89,"park view",1,54.10));
    }

    Hotel(int roomNo, String view, int numBads, double price){
        this.roomNo = roomNo;
        this.view = view;
        this.numBads=numBads;
        this. price = price;
    }
    public ArrayList<Hotel> getAvailableRoom(){
        return room;
    }

    public void displayRooms(){
        int count = 0;
        for(Hotel hall :room){
                System.out.println("\n\t\t--------------------Room "+(++count)+" -----------------\n");
                System.out.println("\t\t\tRoom Id = "+hall.roomNo);
                System.out.println("\t\t\tSight = "+hall.view);
                System.out.println("\t\t\tBed Count = "+hall.numBads);
                System.out.println("\t\t\tAmount = "+ hall.price+" $");
                System.out.println("\n\t\t--------------------------------------------");
        }
    }
    public int roomnum;
    public Hotel reservedRoom;
    
    public void Reservation() {
        int iterate = -1;
        System.out.print("\n-> Enter Room ID for Reservation : ");
        roomnum = sc.nextInt();
        sc.nextLine();
    
        for (Hotel hall : room) {
            ++iterate;
            if (hall.roomNo == roomnum) {
                System.out.println(" \n Successfully Reserved!");
                reservedRoom = hall;
                
                room.remove(iterate);
                break;
            }
        }
    }
    
    public void Details() {
        if (reservedRoom != null && reservedRoom.roomNo == roomnum) {
            System.out.println("\n\t\t----------------ROOM DETAILS---------------\n");
            System.out.println("\t\t\tRoom Id = " + reservedRoom.roomNo);
            System.out.println("\t\t\tSight = " + reservedRoom.view);
            System.out.println("\t\t\tBed Count = " + reservedRoom.numBads);
            System.out.println("\t\t\tAmount = " + reservedRoom.price + " $");
            System.out.println("\n\t\t-------------------------------------------");
        } else {
            System.out.println("\n\t\tRoom with ID " + roomnum + " not found.\n");
        }
    }
        
}
