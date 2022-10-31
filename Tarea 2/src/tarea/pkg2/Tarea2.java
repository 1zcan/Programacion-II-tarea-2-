package tarea.pkg2;

public class Tarea2 {

    public static void main(String[] args) {

        Expendedor e = new Expendedor(400, 200);
        Moneda100 moneda100 = new Moneda100();
        Moneda500 moneda500 = new Moneda500();
        Moneda1000 moneda1000 = new Moneda1000();
        Moneda1500 moneda1500 = new Moneda1500();

        System.out.println("Primera Compra");
        Comprador Ana = new Comprador(moneda100, 2, e);
        System.out.println(Ana.Vuelto());

        System.out.println("Segunda Compra");
        Comprador Bernardo = new Comprador(moneda500, 2, e);
        System.out.println(Bernardo.Vuelto());

        System.out.println("Tercera Compra");
        Comprador Carlita = new Comprador(moneda1000, 2, e);
        System.out.println(Carlita.Vuelto());

        System.out.println("Cuarta Compra");
        Comprador Damian = new Comprador(moneda1500, 2, e);
        System.out.println(Damian.Vuelto());

        System.out.println("Quinta Compra");
        Comprador Fernanda = new Comprador(moneda1500, 2, e);
        System.out.println(Fernanda.Vuelto());
    }

}
