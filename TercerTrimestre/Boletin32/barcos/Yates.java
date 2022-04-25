package barcos;

public class Yates extends Barcos{

    private int cVapor;
    private int camarotes;

    public Yates(String matricula, float eslora, int cVapor, int camarotes) {
        super(matricula, eslora, 0);
        this.cVapor = cVapor;
        this.camarotes = camarotes;
    }

    @Override
    public float calcularPrecioEspecial() {

        return(cVapor*2+camarotes*25);
    }
}
