package modernlibrary;

import java.util.*;
        
public class Event {
    int eventID;
    String eventType;
    Date eventDate;
    //start_time;
    //end_time;
    int eventParticipants;

    void setEventsValues(int id, String type, Date eventd, int noParticipants){
	eventID = id;
	eventType = type;
	eventDate = eventd;
	eventParticipants = noParticipants;
    }
}
