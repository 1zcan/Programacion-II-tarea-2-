
package tarea.pkg2;


class Bebida {
    private String saborBebida;
    private int precio;
    public Bebida(int numSerie, int precio, String saborBebida){
        this.saborBebida = saborBebida;
        this.precio = precio;
    }
    public String getSabor(){
        return saborBebida;
    }
    public int getPrecio(){
        return precio;
    }
    public int getSerie(){
    }
    public abstract String beber(){
    }
} 

public class CocaCola extends Bebida{
    public CocaCola (int precio){
        super(precio);
    }
}

public class Sprite extends Bebida{
    public Sprite (int precio){
        super(precio);
    }
}

public class Fanta extends Bebida{
    public Fanta (int precio){
        super(precio);
    }
}
    
