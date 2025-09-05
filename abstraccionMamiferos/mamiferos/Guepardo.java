package mamiferos;

public class Guepardo extends Felino{

    public Guepardo(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras,
            int velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El guepardo acecha sigilosamente a su presa en " + getHabitad() +
               " y la atrapa con la ayuda de sus garras de " + getTamanoGarras() + " cm.";
    }

    @Override
    public String comunicarse() {
        return "El guepardo emite sonidos agudos para comunicarse con otros individuos en " + getHabitad() + ".";
    }

    @Override
    public String correr() {
        return "El guepardo alcanza velocidades de hasta " + getVelocidad() +
               " km/h, siendo el corredor más veloz de la sabana.";
    }

    @Override
    public String dormir() {
        return "El guepardo descansa bajo los arbustos de " + getHabitad() +
               " para recuperar energías después de una persecución.";
    }

    
    
}
