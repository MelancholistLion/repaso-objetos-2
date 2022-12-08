package uaslp.objetos.escuela;

public class SalaDeJuntasFactory {
    private static SalaDeJuntas salaDeJuntas;
    public static SalaDeJuntas get(String Sala) {
        switch(Sala) {
            case "Sala A":
                salaDeJuntas = SalaDeJuntasA.getInstance();
                break;
            case "Sala B":
                salaDeJuntas = SalaDeJuntasB.getInstance();
                break;
            case "Sala C":
                salaDeJuntas = SalaDeJuntasC.getInstance();
                break;
        }
        return salaDeJuntas;
    }
}
