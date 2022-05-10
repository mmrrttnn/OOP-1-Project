package bg.tu_varna.sit;

public class ReservedDateException extends Exception{
    ReservedDateException(String ErrorMessage){
        super(ErrorMessage);
    }
}
