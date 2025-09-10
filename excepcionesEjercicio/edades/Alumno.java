package edades;

class Alumno {
    private String nombre;
    private int edad;

    //Validación en el constructor 
    public Alumno(String nombre, int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        if (edad < 18) {
            throw new EdadInvalidaException("El alumno debe ser mayor de 18 años.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno: " + nombre + ", Edad: " + edad;
    }
}