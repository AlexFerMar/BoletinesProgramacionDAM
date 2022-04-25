package barcos;

public abstract class Barcos {

    private String matricula;
    private float eslora;
    private float prezoArrendamento;


    public Barcos(String matricula, float eslora, float prezoArrendamento) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.prezoArrendamento = prezoArrendamento;
    }

    public void setPrezoArrendamento(float prezoArrendamento) {
        this.prezoArrendamento = prezoArrendamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public float getEslora() {
        return eslora;
    }

    public float getPrezoArrendamento() {
        return prezoArrendamento;
    }

    public abstract float calcularPrecioEspecial();

}
