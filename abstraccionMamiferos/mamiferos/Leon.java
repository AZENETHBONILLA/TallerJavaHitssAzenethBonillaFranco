package mamiferos;

public class Leon extends Felino {
    
    private int numManada;
    private Float potenciaRugidoDeci;
    
    public Leon(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras,
            int velocidad, int numManada, Float potenciaRugidoDeci) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDeci = potenciaRugidoDeci;
    }

    @Override
    public String comer() {
        return "El león caza junto a su manada de " + numManada +
               " individuos en las llanuras de " + getHabitad() +
               " usando sus garras de " + getTamanoGarras() + " cm.";
    }

    @Override
    public String comunicarse() {
        return "El león ruge con una potencia de " + potenciaRugidoDeci +
               " decibelios para marcar su territorio en " + getHabitad() + ".";
    }

    @Override
    public String correr() {
        return "El león corre a una velocidad de " + getVelocidad() +
               " km/h cuando persigue a sus presas en " + getHabitad() + ".";
    }

    @Override
    public String dormir() {
        return "El león descansa bajo la sombra de los árboles en " + getHabitad() +
               " mientras los cachorros juegan cerca de la manada.";
    }

    
    

    
}
