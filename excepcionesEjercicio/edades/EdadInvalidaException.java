package edades;

// Definimos nuestra excepción personalizada para la edad
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
