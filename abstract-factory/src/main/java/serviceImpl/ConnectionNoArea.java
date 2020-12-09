package serviceImpl;

import service.ConnectionRestService;

public class ConnectionNoArea implements ConnectionRestService {
    @Override
    public void readURL(String url) {
        System.out.println("AREA NO HABILITADA");
    }
}
