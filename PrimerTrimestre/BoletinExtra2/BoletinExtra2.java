package boletinextra2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class BoletinExtra2 {

    public static void main(String[] args) {
        String nomeCliente;
        String numeroConta;
        double tipoInteres;
        double saldo;
        double ingreso;
        double reintegro;
        double importe;
        String cuentaDestino;
        
        Scanner escaner= new Scanner(System.in);
        
        System.out.print("Introduzca un salario base ficticio: ");
        saldo= escaner.nextDouble();
        System.out.print("Introduzca un interes ficticio (añadelo expresado en forma %): ");
        tipoInteres= escaner.nextDouble();
        
        System.out.println("\n->Introduzca sus credneciales:");
        System.out.print("->Introduzca su nombre de cliente:");
        nomeCliente= escaner.next();
        System.out.print("->Introduzca su numero de cuenta:");
        numeroConta= escaner.next();
        
        Conta cuentaPersonal= new Conta();
        
        cuentaPersonal.setNomeCliente(nomeCliente);
        cuentaPersonal.setNumeroConta(numeroConta);
        cuentaPersonal.setSaldo(saldo);
        
        System.out.println("Escoja la accion a realizar: \n1.Visualizar saldo \n2.Ingresar saldo \n3.Retirar saldo \n4.Transferir saldo");
        System.out.print("->Eleccion:");
        byte eleccion= escaner.nextByte();
        
        switch (eleccion) {//Switcher pa elegir que operacion realizar 
            case 1:
                System.out.println("El saldo de la cuenta "+cuentaPersonal.getNumeroConta()+"es de "+cuentaPersonal.getSaldo()+"€");
                break;
            case 2:
                System.out.print("Introduzca el saldo a ingresar:");
                ingreso= escaner.nextDouble();
                cuentaPersonal.ingresarSaldo(ingreso);
                break;
            case 3:
                System.out.print("Introduzca el saldo a retirar:");
                reintegro= escaner.nextDouble();
                cuentaPersonal.retirarSaldo(reintegro);
                break;
            case 4:
                System.out.println("\n->Introduzca las credenciales de la cuanta a la que realizar el ingreso :");
                System.out.print("->Introduzca el numero de cuenta destino:");
                cuentaDestino= escaner.next();
                System.out.print("->Introduzca el saldo a transferir:");
                importe= escaner.nextDouble();
                cuentaPersonal.transferirSaldo(cuentaDestino, importe,tipoInteres);
                break;
            default:
                System.out.println("Operacion no valida");
                break;
        }
    }

}
