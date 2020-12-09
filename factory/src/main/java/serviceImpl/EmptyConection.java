package serviceImpl;

import service.ConectionService;

public class EmptyConection implements ConectionService {
    @Override
    public void connect() {
        System.out.println("NO SE ESPECIFICO PROVEEDOR");
    }

    @Override
    public void discconect() {
        System.out.println("NO SE ESPECIFICO PROVEEDOR");
    }
}
