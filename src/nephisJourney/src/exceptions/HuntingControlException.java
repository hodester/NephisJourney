/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nephisJourney.src.exceptions;

/**
 *
 * @author adamh_000
 */
public class HuntingControlException extends Exception {

    public HuntingControlException() {
    }

    public HuntingControlException(String message) {
        super(message);
    }

    public HuntingControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public HuntingControlException(Throwable cause) {
        super(cause);
    }

    public HuntingControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
