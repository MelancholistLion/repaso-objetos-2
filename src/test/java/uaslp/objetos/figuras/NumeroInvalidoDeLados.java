package uaslp.objetos.figuras;

public class NumeroInvalidoDeLados extends Exception {
    private String message = "Número de lados válido a partir de 5";
    public String getMessage() {
        return message;
    }
}
