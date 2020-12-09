import service.ConectionService;
import serviceImpl.ConectionMySQL;
import serviceImpl.ConectionOracle;
import serviceImpl.ConectionPostgresSQL;
import serviceImpl.EmptyConection;

public class ConnectionFactory {

    public ConectionService getConection(String motor) {
        if (motor == null) {
            return new EmptyConection();
        } else if (motor.equals("MYSQL")) {
            return new ConectionMySQL();
        } else if (motor.equals("ORACLE")) {
            return new ConectionOracle();
        } else if (motor.equals("POSTGRES")) {
            return new ConectionPostgresSQL();
        }
        return new EmptyConection();
    }
}
