package au.com.sensis.ems;

import java.io.IOException;

public class WhereisApiException extends Exception {

    private static final long serialVersionUID = 5957835736755427354L;

    public WhereisApiException(String message) {
        super(message);
    }
    
    public WhereisApiException(IOException e) {
        super(e);
    }
 
}
