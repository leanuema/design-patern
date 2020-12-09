import service.AbstractFactory;
import service.ConnectionRestService;
import service.ConnectionService;

public class App {
    public static void main(String[] args) {

        AbstractFactory abstractFactoryForDB = CreateProduct.getFactory("DataBase");
        ConnectionService firstConection = abstractFactoryForDB.getDataBase("ORACLE");
        firstConection.connect();

        AbstractFactory abstractFactoryForURL = CreateProduct.getFactory("URL");
        ConnectionRestService url = abstractFactoryForURL.getRest("VENTAS");
        url.readURL("http/link-module");
        //Felxibilidad de codigo al no depender de una instancia en particular, porque la Factory no devuelve la implementacion que necesitamos
    }
}
