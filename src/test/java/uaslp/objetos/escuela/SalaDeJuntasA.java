package uaslp.objetos.escuela;

public class SalaDeJuntasA implements SalaDeJuntas {
    private static SalaDeJuntas salaDeJuntasAInstance;
    public static SalaDeJuntas getInstance() {
        if (salaDeJuntasAInstance == null) {
            salaDeJuntasAInstance = new SalaDeJuntasA();
        }
        return salaDeJuntasAInstance;
    }

    public String getNombre() {
        return "Sala A";
    }
}
