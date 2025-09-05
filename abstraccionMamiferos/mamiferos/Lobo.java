package mamiferos;

public class Lobo extends Canino {
    private int numCamada;
    private String especieLobo;

    public Lobo(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, String color,
            Float tamanoCormillos, int numCamada, String especieLobo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoCormillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo de especie " + especieLobo + " caza en grupo junto a su camada de " + numCamada +
               " integrantes en " + getHabitad() + ".";
    }
    @Override
    public String comunicarse() {
        return "El lobo " + getColor() + " aúlla fuertemente para comunicarse con su manada en " + getHabitad() + ".";
    }
    @Override
    public String correr() {
        return "El lobo " + especieLobo + " corre ágilmente por los bosques de " + getHabitad() +
               " mostrando sus colmillos de " + getTamanoCormillos() + " cm.";
    }
    @Override
    public String dormir() {
        return "El lobo " + getColor() + " descansa en las cuevas de " + getHabitad() +
               " después de cazar con su camada.";
    }

    

    

    
    
}
