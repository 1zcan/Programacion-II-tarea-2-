package tarea.pkg2;

import java.util.ArrayList;

//codigo reciclado de pa3p

class Deposito {

    private ArrayList<Bebida> d;

    public Deposito() {
        d = new ArrayList();
    }

    public void addBebida(Bebida k) {
        d.add(k);
    }

    public Bebida getBebida() {
        if (d.size() == 0) {
            return null;
        } else {
            Bebida v;
            v = d.remove(0);
            return v;
        }
    }
}
