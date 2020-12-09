public class App {

    public static void main(String[] args) {
        /**Instansiacion por constructor prohibido por ser private
         Conection c = new Conection();*/
        Conection c = Conection.getInstance();
        c.connectToDB();
        c.disconnectToDB();

        boolean rpta = c instanceof Conection;
        System.out.println(rpta);

        //Spring framework gestiona sus Beans como Singleton por defecto
        //El patron de disenio Singleton, permite tener una unica instancia de una clase para que se utilice en toda la App
    }
}
