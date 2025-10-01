package interfaces;

@FunctionalInterface
public interface Operacion {
    int calcular(int a, int b);
    //Si agregamos otro metodo, ya no es una FuncionalInterface   
}
