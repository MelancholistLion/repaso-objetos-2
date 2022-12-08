package uaslp.objetos.escuela;

public class SalaDeJuntasB implements SalaDeJuntas {
    private static SalaDeJuntas salaDeJuntasBInstance;
    public static SalaDeJuntas getInstance() {
        if (salaDeJuntasBInstance == null) {
            salaDeJuntasBInstance = new SalaDeJuntasB();
        }
        return salaDeJuntasBInstance;
    }

    public String getNombre() {
        return "Sala B";
    }
}
