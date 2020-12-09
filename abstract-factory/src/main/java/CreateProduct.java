import service.AbstractFactory;

public class CreateProduct {

    public static AbstractFactory getFactory(String product) {
        if (product.equals("DataBase")) {
            return new ConnectionDataBaseFactory();
        } else if (product.equals("URL")) {
            return new ConnectionURLFactory();
        }
        return null;
    }
}
