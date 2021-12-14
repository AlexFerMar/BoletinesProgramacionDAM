package boletin4;

/**
 *
 * @author dam1
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
    
    public Libro() {}//Constructor por defecto
    
    public Libro(String pTitulo,String pAutor,int pAno, short pNumPaginas){//Constructor que inicializa los parametros (excepto valoracion)
    
        titulo=pTitulo;
        autor=pAutor;
        ano=pAno;
        numPaginas=pNumPaginas;

    }
    
    public void setTitulo(String pTitulo){//setter para titulo
    
        titulo=pTitulo;
    
    }
    public void setAutor(String pAutor){//setter para autor
    
        autor=pAutor;
    
    }
    public void setAno(int pAno){//setter para año
    
        ano=pAno;
    
    }
    public void setNumPaginas(short pNumPaginas){//setter para numero de paginas 
    
        numPaginas=pNumPaginas;
    
    }
    public void setValoracion(float pValoracion){//setter para valoracion
    
        valoracion=pValoracion;
    
    }
    
    public String getTitulo(){//getter para titulo
        
        return titulo;
    
    }
    public String getAutor(){//getter para autor
        
        return autor;
    
    }
    public int getAno(){//getter para año
        
        return ano;
    
    }
    public short getNumPaginas(){//getter para numero de paginas
        
        return numPaginas;
    
    }
    public float getValoracion(){//getter para valoracion
    
        return valoracion;
    
    }
    public void amosarLibro(){//Metodo que muestra los valores 
        
        System.out.println("Los datos del libro son: \n->Titulo: "+titulo+"\n->Autor: "+autor+"\n->Año: "+ano+"\n->Numero de Paginas: "+numPaginas+"\n->Valoracion: "+valoracion);
       
    }
}
