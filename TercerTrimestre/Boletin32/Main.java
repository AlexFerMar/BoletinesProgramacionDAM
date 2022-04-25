import barcos.Barcos;

import java.util.ArrayList;

import barcos.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Barcos> listaBarcos = new ArrayList<>();

        while (true) {


            switch (Methods.simpleSelector("Que operacion quieres realizar?", "Arrendamentos Nudo", new String[]{"Alquilar", "Ver factura", "Borrar lista", "Salir"})) {

                case 0 -> {
                    switch (Methods.simpleSelector("Que operacion quieres realizar?", "Arrendamentos Nudo", new String[]{"Velero", "Deportivo", "Yate", "Cancelar"})) {

                        case 0 -> {

                            Veleros velero = new Veleros(Methods.askString("Cual es la matricula del barco?"),
                                    Methods.askFloat("Cual es la eslora del barco?"),
                                    Methods.askInt("Cuantos mastiles tiene?"));
                            Methods.calcularPrecioBarco(velero, Methods.askInt("Cuantos dias querrias alquilar el barco?"));
                            listaBarcos.add(velero);

                        }
                        case 1 -> {
                            Deportivos deportivo = new Deportivos(Methods.askString("Cual es la matricula del barco?"),
                                    Methods.askFloat("Cual es la eslora del barco?"),
                                    Methods.askInt("Cuantos C.V. tiene?"));
                            Methods.calcularPrecioBarco(deportivo, Methods.askInt("Cuantos dias querrias alquilar el barco?"));
                            listaBarcos.add(deportivo);

                        }
                        case 2 -> {

                            Yates yate = new Yates(Methods.askString("Cual es la matricula del barco?"),
                                    Methods.askFloat("Cual es la eslora del barco?"),
                                    Methods.askInt("Cuantos C.V. tiene?"),
                                    Methods.askInt("Cuantos camarotes tiene?"));
                            Methods.calcularPrecioBarco(yate, Methods.askInt("Cuantos dias querrias alquilar el barco?"));
                            listaBarcos.add(yate);
                        }
                    }
                }
                case 1 -> {
                    Methods.showMessage(Methods.crearRecibo(listaBarcos));
                }
                case 2 -> {
                    listaBarcos = new ArrayList<>();
                }
                default -> {
                    System.exit(0);
                }

            }

        }
    }
}
