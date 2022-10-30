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

    public void CalVuelto(int  DinIngresado){
        int VueltoADevolver = (DinIngresado - this.precio)/100;
        
        for (int i = 0; i < VueltoADevolver; i++) {
             dm.addMoneda(new Moneda100());
      
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

