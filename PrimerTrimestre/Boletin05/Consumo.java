package boletin5;

/**
 *
 * @author dam1
 */
public class Consumo {

    private double km; //kilómetros percorridos polo coche
    private double litros;  //Litros de combustible consumidos
    private double velocidadMed;//Velocidade media
    private double precioGas;  //Prezo da gasolina

    public Consumo() {
    }//Constructor por defecto

    public Consumo(double pKm, double pLitros, double pVelocidadMed, double pPrecioGas) {//Constructor que inicializa los parametros

        km = pKm;
        litros = pLitros;
        velocidadMed = pVelocidadMed;
        precioGas = pPrecioGas;
    }
    
    public void setKM(double pKm){//setter para km
    
        km=pKm;
    
    }
    public void setLitros(double pLitros){//setter para litros
    
        litros=pLitros;
    
    }
    public void setVelocidadMed(double pVelocidadMed){//setter para velocidadMed
    
        velocidadMed=pVelocidadMed;
    
    }
    public void setPrecioGas(double pPrecioGas){//setter para precioGas
    
        precioGas=pPrecioGas;
    
    }
   
    public double getTiempo() {//getter para tiempo

        double tiempo = km / velocidadMed;

        return tiempo;
    }

    public double getConsumoMedio() {//getter para el consumo medio

        double consumoMedio = (litros * 100) / km;

        return consumoMedio;
    }

    public double getConsumoEuros() {//getter para para el consumo medio expresado en euros

        double consumoEuros = (litros * 100 * precioGas) / km;

        return consumoEuros;
    }

    public void amosarConsumo() {//Metodo que muestra los valores 

        System.out.println("Los datos del viaje son: \n->Km recorridos: " + km + "Km \n->Litros de gasolina consumidos: " + litros + "L \n->Velocidad media del viaje: " + velocidadMed + "Km/H");
        System.out.println("->Precio de la gasolina al repostar: " + precioGas + "€/L \n->Tiempo que se ha tardado en completar el viaje: " + getTiempo() + "Horas");
        System.out.println("->Consumo mkedio de la gasolina: " + getConsumoMedio() + "L/100Km \n->Precio de la gasolina consumida de media " + getConsumoEuros() + "€/100Km");
    }

}
