import service.ConectionService;

public class App {
    public static void main(String[] args) {

        ConnectionFactory conectionFactory = new ConnectionFactory();

        ConectionService oracleConection = conectionFactory.getConection("ORACLE");
        oracleConection.connect();
        oracleConection.discconect();

        ConectionService mysqlConection = conectionFactory.getConection("MYSQL");
        mysqlConection.connect();
        mysqlConection.discconect();

        ConectionService postgresConection = conectionFactory.getConection("POSTGRES");
        postgresConection.connect();
        postgresConection.discconect();

        ConectionService conectionRefused = conectionFactory.getConection("CNT");
        conectionRefused.connect();
        conectionRefused.discconect();

        //Felxibilidad de codigo al no depender de una instancia en particular, porque la Factory no devuelve la implementacion que necesitamos
    }
}
