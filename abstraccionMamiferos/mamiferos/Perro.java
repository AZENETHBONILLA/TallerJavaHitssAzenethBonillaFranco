package mamiferos;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, String color,
            Float tamanoCormillos, int fuerzaMordida) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoCormillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El perro salvaje africano de color " + getColor() +
               " caza en grupo y despedaza a su presa con una mordida de " + fuerzaMordida + " PSI.";
    }

    @Override
    public String comunicarse() {
        return "El perro salvaje africano se comunica con ladridos y chillidos para coordinar la caza en " + getHabitad() + ".";
    }

    @Override
    public String correr() {
        return "El perro salvaje africano recorre largas distancias en " + getHabitad() +
               " mostrando gran resistencia y usando sus colmillos de " + getTamanoCormillos() + " cm al atrapar a la presa.";
    }

    @Override
    public String dormir() {
        return "El perro salvaje africano descansa junto a su manada en " + getHabitad() +
               " después de una intensa jornada de caza.";
    }

}
