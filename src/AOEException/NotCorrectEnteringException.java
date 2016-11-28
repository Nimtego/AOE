package AOEException;

/**
 * Created by nimtego_loc on 25.11.2016.
 */
public class NotCorrectEnteringException extends AOEException {
    public String message;

    public NotCorrectEnteringException(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
