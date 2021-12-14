package boletinextra2;

/**
 *
 * @author dam1
 */
public class Conta {

    private String nomeCliente;
    private String numeroConta;
    private double tipoInteres;
    private double saldo;

    public Conta() {
    }

    public Conta(String pNomeCliente, String pNumeroConta, double pTipoInteres, double pSaldo) {
        nomeCliente = pNomeCliente;
        numeroConta = pNumeroConta;
        tipoInteres = pTipoInteres;
        saldo = pSaldo;
    }

    //Getters y setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String pNomeCliente) {
        nomeCliente = pNomeCliente;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String pNumeroConta) {
        numeroConta = pNumeroConta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double pTipoInteres) {
        tipoInteres = pTipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double pSaldo) {
        saldo = pSaldo;
    }

    //Metodo ingresarSaldo
    public void ingresarSaldo(double ingreso) {

        saldo += ingreso;

        System.out.println("El saldo ingresado en la cuenta " + getNumeroConta() + " es de " + ingreso + "€.\nEl saldo actual de su cuenta es:  " + saldo + "€");
    }
    //Metodo retirarSaldo
    public void retirarSaldo(double reintegro) {

        if (saldo - reintegro < 0) {
            reintegro = saldo;
            saldo = 0;
            System.out.println("\nSaldo para reintegro insuficiente, se retirara la cantidad de saldo que sea posible.\n");
        } else {
            saldo -= reintegro;
        }

        System.out.println("El saldo retirado en la cuenta " + getNumeroConta() + " es de " + reintegro + "€.\nEl saldo actual de su cuenta es:  " + saldo + "€");

    }
    public void transferirSaldo(String cuentaDestino,double importe, double tipoInteres){
        double interes= importe*tipoInteres/100;
        if (saldo - importe < 0) {
            importe = saldo-interes;
            saldo = 0;
            System.out.println("\nSaldo para transferencia insuficiente, se transferira la cantidad saldo que sea posible.\n");
        } else {
            saldo -= (importe+interes);
        }

        System.out.println("->Cuenta origen: "+ getNumeroConta()+"\n->Cuenta destino: "+cuentaDestino+"\nSe han transferido "+ importe+"€.\nEl saldo restante es de "+saldo+"€");
    
    
    
    
    }
    
}
