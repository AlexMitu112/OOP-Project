package modernlibrary;

public class Room {
    String roomNumber;
    String roomType;
    String roomSeats;
    
    void setRoomValues(String no, String type, String seats){
	roomNumber = no;
	roomType = type;
	roomSeats = seats;
	}
    
    String getRNumber(){
        return roomNumber;
    }
    String getRType(){
        return roomType;
    }
    String getRSeats(){
        return roomSeats;
    }
}
