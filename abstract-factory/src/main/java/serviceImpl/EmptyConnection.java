package serviceImpl;

import service.ConnectionService;

public class EmptyConnection implements ConnectionService {
    @Override
    public void connect() {
        System.out.println("NO SE ESPECIFICO PROVEEDOR");
    }

    @Override
    public void disconnect() {
        System.out.println("NO SE ESPECIFICO PROVEEDOR");
    }
}
