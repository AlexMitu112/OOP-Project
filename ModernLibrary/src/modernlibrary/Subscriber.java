package modernlibrary;

public class Subscriber {
    String subName;
    String subSurname;
    String subNoCard;
    String subLibraryCode;//The code they use to log into the system. Students have their reader code bigger than value 10000
    
        
    void setSubscriberValues(String name, String surname, String card, String code){
	subName = name;
	subSurname = surname;
	subNoCard = card;
	subLibraryCode = code;
       
	}
    
    String getsubName(){
        return subName;
    }
    String getsubSurname(){
        return subName;
    }
    String getCard(){
        return subNoCard;
    }
    String getLCode(){
        return subLibraryCode;
    }
   
}
