package uaslp.objetos.figuras;

public class PoligonoRegular {
    private int lados;
    public PoligonoRegular(int lados) throws NumeroInvalidoDeLados {
        if (lados < 5) {
            throw new NumeroInvalidoDeLados();
        } else {
            this.lados = lados;
        }
    }
}
