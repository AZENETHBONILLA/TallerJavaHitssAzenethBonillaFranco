package mamiferos;

public abstract class Canino extends Mamifero {
    protected String color;
    protected Float tamanoCormillos;
    
    public Canino(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, String color,
            Float tamanoCormillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoCormillos = tamanoCormillos;
    }

    public String getColor() {
        return color;
    }

    public Float getTamanoCormillos() {
        return tamanoCormillos;
    }

    
    
    
}
