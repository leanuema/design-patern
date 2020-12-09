public class Conection {

    //Declaracion
    private static Conection instance;

    //Constructor privado para generar un solo objeto
    private Conection() {
    }

    public void connectToDB() {
        System.out.println("Me conecte a la base");
    }

    public void disconnectToDB() {
        System.out.println("Me desconecte de la base");
    }


    /**Getters and Setters*/
    public static Conection getInstance() {
        if (instance == null){
            instance = new Conection();
        }
        return instance;
    }

    public static void setInstance(Conection instance) {
        Conection.instance = instance;
    }
}
