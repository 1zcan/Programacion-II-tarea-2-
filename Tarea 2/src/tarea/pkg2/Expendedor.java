package tarea.pkg2;

class Expendedor {

    public Expendedor() {
        Deposito d = new Deposito();
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

