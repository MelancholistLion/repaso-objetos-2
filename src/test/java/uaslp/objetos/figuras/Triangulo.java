package uaslp.objetos.figuras;

import java.sql.ResultSet;

public class Triangulo {
    private double base;
    private double altura;


    public double getArea() throws BaseNoProvistaException, AlturaNoProvistaException {
        if(base == 0) {
            throw new BaseNoProvistaException();
        } else if(altura == 0) {
            throw new AlturaNoProvistaException();
        } else {
            return (base * altura) / 2;
        }
    }

    public void setBase(double base) {
        this.base = base;
    }
}
