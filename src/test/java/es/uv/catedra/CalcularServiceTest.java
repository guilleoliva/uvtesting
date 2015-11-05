package es.uv.catedra;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


@RunWith(JUnit4.class)
public class CalcularServiceTest {

    private CalcularService calcularService = new CalcularService();

    @Test
    public void sumaTest() {

        Integer resultadoEsperado = 7;
        Integer a = 3;
        Integer b = 4;

        Integer resultado = calcularService.sumar(a, b);
        Assert.assertEquals(resultado, resultadoEsperado);
    }

    //El servicio de calcular debe controlar los param de entrada
    //@Test
    public void sumaNullTest() {

        Integer resultadoEsperado = 7;
        Integer a = null;
        Integer b = null;

        Integer resultado = calcularService.sumar(a, b);
        Assert.assertEquals(resultado, resultadoEsperado);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void restaTest() {

        Integer a = 2, b = 2;
        calcularService.restar(a, b);
    }
}
