package tarea.pkg2;

class Expendedor {

    public Expendedor() {
        DepositoMonedas dmCoca = new DepositoMonedas();
        DepositoMonedas dmSprite = new DepositoMonedas();
        DepositoMonedas dmFanta= new DepositoMonedas();
        
        DepositoBebida dbCoca = new DepositoBebida();
        DepositoBebida dbSprite = new DepositoBebida();
        DepositoBebida dbFanta = new DepositoBebida();
         
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

