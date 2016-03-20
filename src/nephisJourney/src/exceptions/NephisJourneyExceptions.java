
package nephisJourney.src.exceptions;

/**
 *
 * @author Jenaca
 */
public class NephisJourneyExceptions extends Exception {

    public NephisJourneyExceptions() {
    }

    public NephisJourneyExceptions(String message) {
        super(message);
    }

    public NephisJourneyExceptions(String message, Throwable cause) {
        super(message, cause);
    }

    public NephisJourneyExceptions(Throwable cause) {
        super(cause);
    }

    public NephisJourneyExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
