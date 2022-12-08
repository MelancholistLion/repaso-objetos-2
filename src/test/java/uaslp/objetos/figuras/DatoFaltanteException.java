package uaslp.objetos.figuras;

public abstract class DatoFaltanteException extends Exception{
    private String message;
    public String getMessage() {
        return message;
    }
}
