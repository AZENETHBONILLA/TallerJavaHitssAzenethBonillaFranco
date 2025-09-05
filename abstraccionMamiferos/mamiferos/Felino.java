package mamiferos;

public abstract class Felino extends Mamifero {
    protected Float tamanoGarras;
    protected int velocidad;
    
    public Felino(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras,
            int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }

    
    
}
