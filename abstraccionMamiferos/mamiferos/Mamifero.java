package mamiferos;

public abstract class Mamifero {
    protected String habitad;
    protected Float altura;
    protected Float largo;
    protected Float peso;
    protected String nombreCientifico;
    
    public Mamifero(String habitad, Float altura, Float largo, Float peso, String nombreCientifico) {
        this.habitad = habitad;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    public String getHabitad() {
        return habitad;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getLargo() {
        return largo;
    }

    public Float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public abstract String comer();
    public abstract String dormir();
    public abstract String correr();
    public abstract String comunicarse();


    
}
