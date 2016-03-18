package nephisJourney.src.exceptions;

/**
 *
 * @author Jenaca
 */
public class MapControlException extends Exception {

    public MapControlException() {
    }

    public MapControlException(String message) {
        super(message);
    }

    public MapControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public MapControlException(Throwable cause) {
        super(cause);
    }

    public MapControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
