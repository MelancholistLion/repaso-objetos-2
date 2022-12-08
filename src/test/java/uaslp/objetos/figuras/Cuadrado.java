package uaslp.objetos.figuras;

public class Cuadrado {

    private double lado;

    public double getArea() throws LadoNoProvistoException {
        if(lado == 0) {
            throw new LadoNoProvistoException();
        } else {
            return lado * lado;
        }
    }
}
