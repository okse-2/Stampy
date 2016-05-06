package asia.stampy.common.gateway;

/**
 * Created by Ogdans3 on 06.05.2016.
 */
public interface ErrorInterceptor {
    public void onError(ConnectError connectError);
}
