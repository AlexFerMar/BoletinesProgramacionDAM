package boletin7_4;

public class Persona {
    private String nombre;
    private double peso;

    public Persona() {
    }

    public Persona(String pNombre, double pPeso) {
        nombre = pNombre;
        peso = pPeso;
    }


    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    //endregion

}






