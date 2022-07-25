package C10A;

public class Program {
    public static void main(String[] args) {
        CupcakeListo cupcakeDeMirko = new CupcakeListo("chocolate", "avena", "vainilla");

        cupcakeDeMirko.serRegalado();
        cupcakeDeMirko.serComido();

        CupcakeElite cupcakeDeMila = new CupcakeElite("vainilla", "fresa", "chocolateChicle");

        cupcakeDeMila.serComido();
        cupcakeDeMila.serComido("Mila");
    }
}
