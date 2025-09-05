package mamiferos;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras,
            int velocidad, String especieTigre) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El tigre de especie " + especieTigre + " caza sigilosamente en la selva de " + getHabitad()
                + " usando sus garras de " + getTamanoGarras() + " cm.";
    }

    @Override
    public String comunicarse() {
        return "El tigre " + especieTigre + " ruge con fuerza para marcar su territorio en " + getHabitad() + ".";
    }

    @Override
    public String correr() {
        return "El tigre corre a " + getVelocidad() + " km/h para atrapar a su presa.";
    }

    @Override
    public String dormir() {
        return "El tigre " + especieTigre + " duerme largas horas bajo la sombra de los árboles en " + getHabitad() + ".";
    }

    


}