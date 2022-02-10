package aplicacion;

public class ArrayNullExeption extends Exception{

    private String errorMesage="El inventario de libros no puede estar vacio";

    public String getErrorMesage() {
        return errorMesage;
    }
}
