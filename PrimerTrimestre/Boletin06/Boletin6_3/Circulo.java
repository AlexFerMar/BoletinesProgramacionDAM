package boletin6_3;

/**
 *
 * @author wolke
 */
public class Circulo {

    private double radio;

    public Circulo() {
    }

    public Circulo(double pRadio) {
        radio = pRadio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double pRadio) {
        radio = pRadio;
    }

    public double calcularArea() {

        double area = Math.pow(radio, 2) * Math.PI;
        return area;
    }

    public double calcularLonxitude() {

        double lonxitude = 2 * radio * Math.PI;
        return lonxitude;
    }

    public void showCirculo() {

        System.out.println("\n El radio del circulo es: " + radio + "\n El area del circculo es: " + calcularArea() + "\n La longitud del circulo es: " + calcularLonxitude());
    }

}
