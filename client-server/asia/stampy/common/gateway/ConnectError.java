package asia.stampy.common.gateway;

/**
 * Created by Ogdans3 on 06.05.2016.
 */
public class ConnectError extends Exception {
    //Parameterless Constructor
    public ConnectError() {}

    //Constructor that accepts a message
    public ConnectError(String message)
    {
        super(message);
    }
}
