package tarea.pkg2;

class Comprador {

    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        vuelto = 0;
        Bebida bebida;
        try {
            bebida = exp.comprarBebida(m,cualBebida);
        } finally {
            Moneda d;
            do {
                d = exp.getVuelto();
                if (d != null) {
                    vuelto += d.getValue();
                }
            } while (d != null);
        }

    }

    public int Vuelto() {
        return vuelto;
    }

}
