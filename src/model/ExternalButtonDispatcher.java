package model;

public class ExternalButtonDispatcher extends ButtonDispatcher {

    public static volatile ExternalButtonDispatcher externalButtonDispatcher;
    private ExternalButtonDispatcher() {}

    public static ExternalButtonDispatcher getInstance() {
        if(externalButtonDispatcher == null) {
            synchronized (ExternalButtonDispatcher.class) {
                if(externalButtonDispatcher == null) {
                    externalButtonDispatcher = new ExternalButtonDispatcher();
                }
            }
        }
        return externalButtonDispatcher;
    }
    @Override
    public void submitRequest(int floor, Direction direction) {

    }
}
