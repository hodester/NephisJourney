
package nephisJourney.src.exceptions;

/**
 *
 * @author Jenaca
 */
public class ProgramControlException extends Exception {
    public ProgramControlException() {
    }

    public ProgramControlException(String message) {
        super(message);
    }

    public ProgramControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProgramControlException(Throwable cause) {
        super(cause);
    }

    public ProgramControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
