package tarea.pkg2;

class Expendedor {

    public Expendedor() {
        DepositoMonedas dm = new DepositoMonedas();
        DepositoBebida db = new DepositoBebida();
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

