package paritycube.eventbuslibrarydemo;

/**
 * Created by prashant on 12/06/17.
 */

public class MessageEvent {
    private String message;

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
