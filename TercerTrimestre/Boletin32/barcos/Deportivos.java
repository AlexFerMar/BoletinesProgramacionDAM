package barcos;

public class Deportivos extends Barcos{

    private int cVapor;

    public Deportivos(String matricula, float eslora, int cVapor) {
        super(matricula, eslora, 0);
        this.cVapor = cVapor;
    }

    @Override
    public float calcularPrecioEspecial() {

        return(cVapor*2);
    }

}
