package uaslp.objetos.figuras;

public class PoligonoRegular extends Figura {
    private String name = "Poligono Regular";
    private int lados;

    public PoligonoRegular(int lados) {
        this.lados = lados;
    }

    public String getName() {
        return name;
    }
}
