package tarea.pkg2;

class Comprador{
    private int vuelto;
    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        vuelto = m - Bebida.getPrecio();
    }
    if(vuelto != 0){
        vuelto = m;
    }
    else{
            vuelto = 0;
    }
    
}
