package tarea.pkg2;

class Moneda {

    public Moneda(){
        
    }
    public String getSerie(){
        return this;
    }
}

class Moneda100 extends Moneda{
    public Moneda100(){
        
    }
    public int valor(){
        return 100;
    }
}

class Moneda500 extends Moneda{
    public Moneda500(){
        
    }
    public int valor(){
        return 500;
    }
}
        
class Moneda1000 extends Moneda{
    public Moneda1000(){
        
    }
    public int valor (){
        return 1000;
    }
}