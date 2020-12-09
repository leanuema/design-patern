import service.AbstractFactory;
import service.ConnectionRestService;
import service.ConnectionService;
import serviceImpl.ConnectionMySQL;
import serviceImpl.ConnectionOracle;
import serviceImpl.ConnectionPostgresSQL;
import serviceImpl.EmptyConnection;

public class ConnectionDataBaseFactory implements AbstractFactory {

    @Override
    public ConnectionService getDataBase(String engine) {
        if (engine == null) {
            return new EmptyConnection();
        } else if (engine.equals("MYSQL")) {
            return new ConnectionMySQL();
        } else if (engine.equals("ORACLE")) {
            return new ConnectionOracle();
        } else if (engine.equals("POSTGRES")) {
            return new ConnectionPostgresSQL();
        }
        return new EmptyConnection();
    }

    @Override
    public ConnectionRestService getRest(String url) {
        return null;
    }
}