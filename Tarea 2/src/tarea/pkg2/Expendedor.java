package tarea.pkg2;

class Expendedor {
    private int precio;
    private int vuelto;
    private DepositoMonedas dm;
    private DepositoBebida dbCoca;
    private DepositoBebida dbSprite;
    private DepositoBebida dbFanta;
    

    public Expendedor(int precio) {
        this.precio = precio;
        
         dm = new DepositoMonedas(); 
         dbCoca = new DepositoBebida();
         dbSprite = new DepositoBebida();
         dbFanta = new DepositoBebida(); 
    }

    public void CalVuelto(int  DinIngresado){
        int VueltoADevolver = (DinIngresado - this.precio)/100;
        
        for (int i = 0; i < VueltoADevolver; i++) {
             dm.addMoneda(new Moneda100());
        }
    }
    
    public void mensajesVuelto(){
        if (dm.getSize() != 0) {
            System.out.println("100");
        } else {
            System.out.println("tomaste todo el vuelto");
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

