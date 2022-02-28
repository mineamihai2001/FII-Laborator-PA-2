package room_assignment;

public class Main {
    public static void main(String[] args) {
        System.out.print("Events: ");
        Event e = new Event("Test_Event", 100, 1020, 1350);
        System.out.println(e.toString());

        System.out.print("Rooms: ");
        Room r = new Room("C202", 100);
        System.out.println(r.toString());

    }
}
