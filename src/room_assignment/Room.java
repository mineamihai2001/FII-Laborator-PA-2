package room_assignment;

public class Room {
    private String name;
    private int capacity;
    private enum Type{
        course, lab;
    }

    //Constructors
    public Room() {
        this.name = "";
        this.capacity = 0;
    }
    public Room(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        String s;
        s = this.name + " (capacity = " + this.capacity + ")";
        return s;
    }
}
