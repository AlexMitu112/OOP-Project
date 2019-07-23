package modernlibrary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Borrow {
    Date borrowStart;
    Date borrowEnd;
    String borrowISBN;

    void setBorrowValues(Date start, Date end, String code){
	borrowStart = start;
	borrowEnd = end;
        borrowISBN = code;
    }
    
    Date getbStart(){
        return borrowStart;
    }
    Date getbEnd(){
        return borrowEnd;
    }
    String getbISBN(){
        return borrowISBN;
    }
    
    void extendPeriod(){

    }
}

