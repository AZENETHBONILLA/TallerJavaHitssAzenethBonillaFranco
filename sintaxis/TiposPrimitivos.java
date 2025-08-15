package sintaxis;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //char
        char variableChar = 'A';
        System.out.println("Char: "+ variableChar);

        //boolean
        boolean esValido = true;
        System.out.println("Boolean: "+ esValido);

        //int ==> byte
        int enteroByte = 127;
        System.out.println("Entero Byte: "+ enteroByte);
        System.out.println("Valor minimo del byte:" + Byte.MIN_VALUE);
        System.out.println("Valor máximo del byte:" + Byte.MAX_VALUE);

        //Entero ==>short
        short enteroShort = 32123;
        System.out.println("Entero Short: "+ enteroShort);
        System.out.println("Valor minimo del byte:" + Short.MIN_VALUE);
        System.out.println("Valor máximo del byte:" + Short.MAX_VALUE);

        //Entero ==>int
        short entero = 32123;
        System.out.println("Entero int: "+ entero);
        System.out.println("Valor minimo del int:" + Integer.MIN_VALUE);
        System.out.println("Valor máximo del int:" + Integer.MAX_VALUE);

        //Enteros ==> long
        long enteroLong = 324538888L;
        System.out.println("Entero long: "+ enteroLong);
        System.out.println("Valor minimo de long:" + Long.MIN_VALUE);
        System.out.println("Valor máximo de long:" + Long.MAX_VALUE);

        //Números flotantes o decimales ==> float

        //E para exponencial E-3F
        float numerorealFloat = 3.1416F; 
        System.out.println("Entero real float: "+ numerorealFloat);
        System.out.println("Valor minimo de float:" + Float.MIN_VALUE);
        System.out.println("Valor máximo de float:" + Float.MAX_VALUE);

        //Número flotante o decimales ==>double
        double numeroDouble = 3.1416;
        System.out.println("Entero double: "+ numeroDouble);
        System.out.println("Valor minimo de DOUBLE:" + Double.MIN_VALUE);
        System.out.println("Valor máximo de double:" + Double.MAX_VALUE);

        //String
        String nombre = "Azeneth";
        System.out.println("Nombre: "+ nombre.toUpperCase());
        
        //Conversión de tipos:

        int i= 100;
        double d = i; //conversión automática

        System.out.println(d);
        // int x = d; un doble es mayor que int 

        int x= (int)d; //conversión explicita
        System.out.println("x: "+x);

        //Tipos de referencia
        //String s= x; no se puede 
        Integer y = 0;
        String s= y.toString(x);
        System.out.println("s: "+ s);


    }
    
}
