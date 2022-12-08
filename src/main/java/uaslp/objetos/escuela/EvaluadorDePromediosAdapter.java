package uaslp.objetos.escuela;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvaluadorDePromediosAdapter {
    private final EvaluadorDePromedios evaluadorDePromedios;
    private final List<Double> listaDeCalificaciones = new ArrayList<>();

    public EvaluadorDePromediosAdapter(EvaluadorDePromedios evaluadorDePromedios) {
        this.evaluadorDePromedios = evaluadorDePromedios;
    }

    public double evalua(String listaDeCalificaciones) {
        List<String> calificaciones = new ArrayList<>(Arrays.asList(listaDeCalificaciones.split(",")));

        for (String calificacion : calificaciones) {
            this.listaDeCalificaciones.add(Double.parseDouble(calificacion));
        }

        return evaluadorDePromedios.evalua(this.listaDeCalificaciones);
    }
}
