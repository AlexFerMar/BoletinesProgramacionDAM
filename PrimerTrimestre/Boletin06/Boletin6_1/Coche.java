package boletin6_1;

/**
 *
 * @author wolke
 */
public class Coche {

    private int velocidade;

    public Coche() {
        velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int masVelocidad) {
        
        velocidade += masVelocidad; 
        //Esto es un Operador de asignación
        //Es el quivalante a poner: velocidade= velocidade + masVelocidad
    }
    public void frenar(int menosVelocidad) {
        
        velocidade -= menosVelocidad; 
        //Esto es un Operador de asignación
        //Es el quivalante a poner: velocidade= velocidade - masVelocidad
        
        if (velocidade<0){//Este condicional esta qui para asegurarse de que el coche no tenga una velocidad menos que '0'
            velocidade=0;//Asumimos que frenar el coche no equivale a dar marcha atras
        }
    
    }
    
    
}
