import serviceImpl.SpareAccountServiceImpl;

public class App {
    public static void main(String[] args) {

        SpareAccountServiceImpl cuentaCorriente = new SpareAccountServiceImpl();
        cuentaCorriente.setAmount(200.0);

        SpareAccountServiceImpl cuentaCorrienteClon = (SpareAccountServiceImpl) cuentaCorriente.cloneObject();

        if (cuentaCorrienteClon != null) {
            System.out.println(cuentaCorrienteClon);
        }
        System.out.println(cuentaCorriente == cuentaCorrienteClon);
    }
    //Este patron nos sirve para cuando tenemos un objeto muy grande con mucha informacion,
    // entonces para evitar tener una nueva instancia y asignar valores, se clona
}
