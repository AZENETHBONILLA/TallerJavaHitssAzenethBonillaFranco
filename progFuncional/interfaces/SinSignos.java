package interfaces;

@FunctionalInterface
public interface SinSignos<T, R> {
    R procesar(T dato);
    //Si agregamos otro metodo, ya no es una FuncionalInterface   
}
