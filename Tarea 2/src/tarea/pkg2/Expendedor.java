package tarea.pkg2;

class Expendedor {
    private int precio;
    private int vuelto;
    private DepositoMonedas dm;
    private DepositoBebida dbCoca;
    private DepositoBebida dbSprite;
    private DepositoBebida dbFanta;
    

    public Expendedor(int precio,int cantidad) {
        this.precio = precio;
        
         dm = new DepositoMonedas(); 
         dbCoca = new DepositoBebida();
         dbSprite = new DepositoBebida();
         dbFanta = new DepositoBebida(); 
    
    for(int i= 0; i < cantidad; i++ ){
    dbCoca.addBebida(new CocaCola(i +100, precio, "Cola"));
    dbSprite.addBebida(new CocaCola(i +200, precio, "Sprite"));
    dbFanta.addBebida(new CocaCola(i +300, precio, "Fanta"));
}
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
    
    public Bebida comprarBebida(Moneda mon, int saborbebida) throws PagoInsuficienteException, NoHayBebidaException, PagoIncorrectoException{
        if(mon != null){
            //Coca=1;Fanta=2;Sprite=3;
            Bebida aux;
            int vuelto;
            if(saborbebida == 1){
                aux = dbCoca.getBebida();
                vuelto = CocaCola.getPrecio();
            }
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

