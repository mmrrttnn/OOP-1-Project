package bg.tu_varna.sit;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<String> ReservedDates;
    private List<Event> AllEvents;

    public Program() {
        this.ReservedDates = new ArrayList<>();
        this.AllEvents =  new ArrayList<>();
    }

    public void addEvent(String date, Hall hall, String eventName) throws ReservedDateException {
        for(String currDate:ReservedDates){
            for(Event e: hall.getEvents()) {
                if (e.getDate().equals(date)) {
                    throw new ReservedDateException("There is already an event in this hall reserved on this date");
                }
            }
        }

        Event newEvent = new Event(eventName, date, hall);
        hall.addEvent(newEvent);
        AllEvents.add(newEvent);
    }

    public String freeSeats(String date, String eventName) {
        for (Event currEvent : AllEvents) {
            if (currEvent.getEventName().equals(eventName) && currEvent.getDate().equals(date)) {
                int freeSeats = currEvent.getHall().getFreeSeats();
                if (freeSeats > 0) {
                    return "There are " + freeSeats + " free seats!";
                }
                else {
                    return "No free seats";
                }
            } else {
                return "There is no such event " + eventName + " on " + date;
            }
        }

        return "No event named " + eventName;
    }

    public String bookTicket(String eventName, String date){
        for(Event currEvent: AllEvents){
            if(currEvent.getEventName().equals(eventName)){

            }
        }
        return "";
    }
}
