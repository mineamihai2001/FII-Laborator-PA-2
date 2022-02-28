package room_assignment;

public class Event {
    private String name;
    private int size, startTime, endTime;

    //Constructors
    public Event() {
        this.name = "";
        this.size = 0;
        this.startTime = 0;
        this.endTime = 0;
    }

    public Event(String name, int size, int startTime, int endTime) {
        this.name = name;
        this.size = size;
        this.startTime = startTime;
        this.endTime = endTime;
    }

//    Getters
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        String s;
        s = this.name + " (size = " + this.size + ", start = " + this.startTime + ", end = " + this.endTime + ")";
        return s;
    }

}
