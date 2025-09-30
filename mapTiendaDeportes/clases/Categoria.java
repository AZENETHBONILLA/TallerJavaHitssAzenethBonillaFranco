package clases;

public enum Categoria {
    A("Fútbol"),
    B("Básquetbol"),
    C("Voleibol"),
    D("Tenis"),
    E("Running"),
    F("Natación"),
    G("Béisbol"),
    H("Ciclismo"),
    I("Boxeo"),
    J("Artes Marciales"),
    K("Gimnasia"),
    L("Atletismo");

    private final String deporte;

    Categoria(String deporte){
        this.deporte = deporte;
    }

    public String getDeporte() {
        return deporte;
    }

    @Override
    public String toString() {
        return deporte;
    }
}
