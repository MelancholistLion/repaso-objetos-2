package uaslp.objetos.escuela;

public class SalaDeJuntasC implements SalaDeJuntas {
    private static SalaDeJuntas salaDeJuntasCInstance;
    public static SalaDeJuntas getInstance() {
        if (salaDeJuntasCInstance == null) {
            salaDeJuntasCInstance = new SalaDeJuntasC();
        }
        return salaDeJuntasCInstance;
    }

    public String getNombre() {
        return "Sala C";
    }
}
