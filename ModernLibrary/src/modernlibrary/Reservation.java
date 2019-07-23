package modernlibrary;

import java.util.*;


public class Reservation{
    Date reservationStart;
    Date resevationEnd;
    String Type;
    int IDItem;

    void setReservationValues(Date start, Date end, String type, int idi){
	reservationStart = start;
	resevationEnd = end;
        Type=type;
        IDItem=idi;
    }
    
}
