package sintaxis;

public class TiposDatos {
    static String nombre;
    static int edad;
    static boolean esValido;

    public static void main(String[] args) {
        //VARIABLES LOCALES
        int edad;
        //Bloque ( del interno al externo no existe)
        {
            edad = 40;
        }
        System.out.println(edad);
        //Cuando no es estatica se debe instanciar. 
        //TiposDatos objeto = new TiposDatos();
        //objeto.saludar();
        //Variable de instancia 
        TiposDatos.saludar();
       
    }
    
    public static void saludar(){
        nombre = "Azeneth";
        System.out.println("Edad:"+ edad);
        System.out.println("Nombre: "+ nombre);
        System.out.println("Valido: "+ esValido);
    }
}
