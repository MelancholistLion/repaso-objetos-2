package uaslp.objetos.escuela;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class Exercise6 {

     /*
    INSTRUCCIONES EJERCICIO 6:

    PARA ESTE EJERCICIO DEBERÁS:
    -> Crear Elementos necesarios para que el programa compile
    -> Lograr un 100% de coverage de la clase AlgoritmoX

    En este ejercicio los tests que crees deberán estar en esta clase, es el UNICO
    ejercicio en el que se te permite modificar el Unit Test, PERO está prohibido
    modificar el test existente "validarInterfacesCreadas"

     */

    @Test
    public void AEqualsB() {
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);


        algoritmoX.algoritmoACubrir(27, 27, "A = B");

        Mockito.verify(dependencia1).save("A = B");
        Mockito.verify(dependencia3).recover();
        verifyNoMoreInteractions(dependencia1, dependencia2, dependencia3);
    }
    @Test
    public void AMoreThanB() {
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(72, 27, "A > B");

        Mockito.verify(dependencia1).save("A > B");
        Mockito.verify(dependencia3).recover();
        verifyNoMoreInteractions(dependencia1, dependencia2, dependencia3);
    }

    @Test
    public void ALessThanB() {
        Dependencia1 dependencia1 = Mockito.mock(Dependencia1.class);
        Dependencia2 dependencia2 = Mockito.mock(Dependencia2.class);
        Dependencia3 dependencia3 = Mockito.mock(Dependencia3.class);
        AlgoritmoX algoritmoX = new AlgoritmoX(dependencia1, dependencia2, dependencia3);

        algoritmoX.algoritmoACubrir(27, 72, "A < B");

        Mockito.verify(dependencia1).save("A < B");
        Mockito.verify(dependencia3).recover();
        verifyNoMoreInteractions(dependencia1, dependencia2, dependencia3);
    }



    @Test
    public void validarInterfacesCreadas(){
        assertThat(Dependencia1.class).isInterface();
        assertThat(Dependencia2.class).isInterface();
        assertThat(Dependencia3.class).isInterface();
    }
}
