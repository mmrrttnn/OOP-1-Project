package bg.tu_varna.sit;

public class Event {
    private String eventName;
    private String date;
    private Hall hall;

    public Event(String eventName, String date, Hall hall) {
        this.eventName = eventName;
        this.date = date;
        this.hall = hall;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDate() {
        return date;
    }

    public Hall getHall() {
        return hall;
    }
}
