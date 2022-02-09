package Comercio;

public class Producto {

    //Temos unha clase produto cons atributos: codigo int,nome string, tipo string, precio float,stock int;

    int codigo;

    String nome;

    String tipo;

    float precio;

    int stock;


    public Producto() {
    }

    public Producto(int codigo, String nome, String tipo, float precio, int stock) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }




}
