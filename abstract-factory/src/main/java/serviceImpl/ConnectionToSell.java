package serviceImpl;

import service.ConnectionRestService;

public class ConnectionToSell implements ConnectionRestService {
    @Override
    public void readURL(String url) {
        System.out.println("SE CONECTO AL AREA DE VENTAS: " + url);
    }
}
