package Comercio;


public class Main {

    public static void main(String[] args) {

        String[] opciones = {"Agregar Producto", "Ver Stock", "Eliminar Producto", "Obtener producto", "Buscar Producto", "Rebajar", "Salir"};

        Comercio corteFrances = new Comercio();

        int seleccion = 0;
        do {

            seleccion = Funciones.simpleSelector("Escoje una opcion", "Corte Frances", opciones);

            switch (seleccion) {

                case 0 -> {
                    corteFrances.agregar();
                }

                case 1 -> {
                    corteFrances.enseñarStock();
                }

                case 2 -> {
                    corteFrances.eliminarProducto(Funciones.askInt("Introduce el codigo del producto a eliminar"));
                }

                case 3 -> {
                    corteFrances.comprarProducto(Funciones.askInt("Introduce el codigo del producto"), Funciones.askInt("Introduce las unidades que desea del producto"));
                }

                case 4 -> {
                    corteFrances.buscarCodigo(Funciones.askInt("Introduce el codigo del producto"));
                }

                case 5 -> {
                    corteFrances.rebaja();
                }

                default -> {
                    seleccion = -1;
                }
            }


        } while (seleccion != -1);



    }

}
