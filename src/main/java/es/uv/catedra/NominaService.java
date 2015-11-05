package es.uv.catedra;


public class NominaService {

    public float calculaNominaNeta(float nominaBruta){

        float retencion = 0.18f;
        float nominaNeta = nominaBruta * (1-retencion);

        return nominaNeta;
    }

    public float calculaNominaBruta(TipoTrabajador tipo, Integer ventas, Integer horasExtra){

        throw new UnsupportedOperationException();
    }

}
