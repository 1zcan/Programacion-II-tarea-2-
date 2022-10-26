package tarea.pkg2;

abstract class Moneda {

    public Moneda(){
        
    }
    public Moneda getSerie(){
        return this;
    }
}

class Moneda100 extends Moneda{
    public Moneda100(){
        super();
    }
    public int valor(){
        return 100;
    }
}

class Moneda500 extends Moneda{
    public Moneda500(){
        super();
    }
    public int valor(){
        return 500;
    }
}
        
class Moneda1000 extends Moneda{
    public Moneda1000(){
        super();
    }
    public int valor (){
        return 1000;
    }
}