package es.uv.catedra;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class NominaServiceTest {

    private NominaService nominaService = new NominaService();

    @Test
    public void calculaNominaNeta2000Test(){

        float nominaBruta = 2000f;

        float nominaNeta = nominaService.calculaNominaNeta(nominaBruta);

        Assert.assertEquals(1640f,nominaNeta,0.01);
    }

    @Test
    public void calculaNominaNeta1500Test(){

        float nominaBruta = 1000f;
        float nominaNeta = nominaService.calculaNominaNeta(nominaBruta);

        //Assert.assertEquals(840f,nominaNeta,0.01);
    }
}
