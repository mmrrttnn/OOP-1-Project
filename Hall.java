package bg.tu_varna.sit;

import java.util.ArrayList;
import java.util.List;

public class Hall {
    private String hallName;
    private final int rows;
    private final int seatsPerRow;
    private static int takenSeats = 0;
    private List<List<String>> seats;

    private List<Event> events;

    public Hall(String hallName, int rows, int seatsPerRow) {
        this.hallName = hallName;
        this.rows = rows;
        this.seatsPerRow = seatsPerRow;
        this.events = new ArrayList<>();
        this.seats = new ArrayList<>();
    }

    public String getHallName() {
        return hallName;
    }

    public int getRows() {
        return rows;
    }

    public int getSeatsPerRow() {
        return seatsPerRow;
    }

    public List<Event> getEvents() {
        return events;
    }

    public void addEvent(Event event){
        events.add(event);
    }

    public void removeEvent(Event event){
        events.remove(event);
    }

    protected void bookSeat() {
        takenSeats++;
    }

    protected int getFreeSeats() {
        return (rows * seatsPerRow) - takenSeats;
    }
}
