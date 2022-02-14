package Main;

public class Libro {

    private String titulo;

    private String autor;

    private String isbm;

   private float precio;

   private int unidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbm, float precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbm = isbm;
        this.precio = precio;
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbm() {
        return isbm;
    }

    public void setIsbm(String isbm) {
        this.isbm = isbm;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
}
