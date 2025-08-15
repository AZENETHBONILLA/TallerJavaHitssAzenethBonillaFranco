package sintaxis;

public class Operadores {
    public static void main(String[] args) {
        int a= 10;
        int b = 3;

        int suma= a+b;
        System.out.println("Suma:"+ suma);

        System.out.println("Suma: "+ (a+ b));
        System.out.println("Resta: "+ (a-b));
        System.out.println("División: "+ (a/b));
        System.out.println("Multiplicación: "+ (a*b));
        System.out.println("Módulo: "+ (a%b));

        //ctrl + }
        //Operadores de asignación
        //parte derecha se asigna a la parte derecha  
        int c = 12;
        //c = c + 5;
        c += 5;
        System.out.println("Valor de c: "+ c);

        c -=5; //c = c - 5;
        c *=5; //c = c * 5;
        c /=5; //c = c / 5;
        c %=5; //c = c % 5;


        //Operadores de comparación 
        a = 12;
        b= 2;

        System.out.println("Igual: "+ (a == b));
        System.out.println("Diferencia : "+ (a != b));
        System.out.println("Mayor que : "+ (a > b));
        System.out.println("Menor que : "+ (a < b));
        System.out.println("Mayor o igual que : "+ (a >= b));
        System.out.println("Menor o igual que : "+ (a <= b));

        //Operadores lógicos 
        //AND
        //true && true = true 
        //true && false = false
        System.out.println("And: "+((a<b) && (a>=b)));

        //OR
        // true || true = true
        // true || false = true 
        // false || true = true 
        System.out.println("Or: "+ ((a < b) && (a >= b)));

        //NOT
        // !true => false 
        // !false => true 
        System.out.println("not: "+ (!(a < b)));
    }
    
}
