package serviceImpl;

import service.ConnectionRestService;

public class ConnectionToBuy implements ConnectionRestService {
    @Override
    public void readURL(String url) {
        System.out.println("SE CONECTO AL AREA DE COMRAS: " + url);
    }
}
