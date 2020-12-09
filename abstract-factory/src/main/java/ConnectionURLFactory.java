import service.AbstractFactory;
import service.ConnectionRestService;
import service.ConnectionService;
import serviceImpl.*;

public class ConnectionURLFactory implements AbstractFactory {

    @Override
    public ConnectionService getDataBase(String engine) {
        return null;
    }

    @Override
    public ConnectionRestService getRest(String url) {
        if (url == null) {
            return new ConnectionNoArea();
        } else if (url.equals("VENTAS")) {
            return new ConnectionToSell();
        } else if (url.equals("COMPRAS")) {
            return new ConnectionToBuy();
        }
        return new ConnectionNoArea();
    }
}