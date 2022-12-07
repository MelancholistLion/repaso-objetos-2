package uaslp.objetos.figuras;

import java.lang.Math;

public class PoligonoRegular {
    private int numeroDeLados;
    private double lado;

    public PoligonoRegular(int numeroDeLados, double lado) {
        this.numeroDeLados = numeroDeLados;
        this.lado = lado;
    }
    public PoligonoRegular(int numeroDeLados) {
        this.numeroDeLados = numeroDeLados;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        double apotema = (lado / 2) / Math.tan(Math.toRadians(360 / numeroDeLados / 2));
        return (lado * numeroDeLados * apotema) / 2;
    }

    public double getLado() {
        return lado;
    }
}
