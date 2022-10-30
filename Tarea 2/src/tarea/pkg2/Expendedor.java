package tarea.pkg2;

class Expendedor {
    private int precio;
    private int vuelto;

    public Expendedor(int precio) {
        this.precio = precio;
        
        DepositoMonedas dm = new DepositoMonedas(); 
        DepositoBebida dbCoca = new DepositoBebida();
        DepositoBebida dbSprite = new DepositoBebida();
        DepositoBebida dbFanta = new DepositoBebida(); 
    }
    
    public Bebida ComprarBebida(Moneda m, int saborB){
        if(m == null){
            
        }
    }
    
    
    
    
    
    
class PagoInsuficienteException extends Exception{
    public PagoInsuficienteException(){
        super("Dinero insuficiente");
    }
}

class PagoIncorrectoException extends Exception{
    public PagoIncorrectoException(){
        super("Pago incorrecto");
    }
}

class NoHayBebidaException extends Exception{
    public NoHayBebidaException(){
        super("Deposito de bebidas vacio");
    }
}
}

