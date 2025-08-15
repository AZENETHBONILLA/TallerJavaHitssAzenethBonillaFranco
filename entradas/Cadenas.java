package entradas;

public class Cadenas {
    public static void main(String[] args) {
        String nombre = "     Azeneth Bonilla FRanco";
        String nombre2 = "Azeneth BoniLla Hola Franco";

        System.out.println("length(): "+ nombre.length());
        //System.out.println("==: "+ (nombre == nombre2)); no recomendable
        System.out.println("equals(): "+ (nombre.equals(nombre2))); //Comparación de cadenas
        System.out.println("equalIgnoreCase(String b): " + (nombre.equalsIgnoreCase(nombre2)));
        System.out.println("charAt(int 1): " +nombre.charAt(6));
        
        System.out.println("Nombre: "+ nombre);
        System.out.println("trim(): "+ nombre.trim()); //sin espacios al principio y final

        //Extraer cadena de la subcadena

        System.out.println("Substring (int a, int b): " + (nombre2.substring(5, 12)));
        System.out.println("Substring (int i): "+ nombre2.substring(2));


        System.out.println("indexof(String Cadena): "+ nombre2.indexOf("Hola"));
        System.out.println("lastIndexOf(String cadena): "+ nombre2.lastIndexOf("Franco"));

        System.out.println("starWith(srting prefijo): "+ nombre2.startsWith("B"));
        System.out.println("endWith(String sufijo): "+ nombre2.endsWith("o"));

        System.out.println("toLowerCase(): "+ nombre2.toLowerCase());
        System.out.println("toUppercase(): "+ nombre2.toUpperCase());
    }   

    
}
