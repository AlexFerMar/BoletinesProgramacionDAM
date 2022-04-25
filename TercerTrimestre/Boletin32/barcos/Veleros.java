package barcos;

public class Veleros extends Barcos{

    private int mastiles;


    public Veleros(String matricula, float eslora, int mastiles) {
        super(matricula, eslora, 0);
        this.mastiles = mastiles;
    }

    @Override
    public float calcularPrecioEspecial() {

        return(mastiles *8);
    }


}
