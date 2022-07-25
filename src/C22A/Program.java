package C22A;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Carrito carritoDeMarcos = new Carrito("Marcos");
        Sandwich hamburguesaQueso = new Sandwich("Hambuqueso", 20.2);
        Sandwich hamburguesaVegana = new Sandwich("HambuVega", 23.2);
        Sandwich hamburguesaVeggie = new Sandwich("HambuVeggie", 25.2);

        Acompanamiento papas = new Acompanamiento("papas fritas", 17.5);
        Acompanamiento ensalada = new Acompanamiento("ensalada", 18.5);

        Bebida pepsiLight = new Bebida("PepsiLight", 12.78);
        Bebida coca = new Bebida("CocaCola", 13.00);

        ArrayList<Comprable> productosDelCombo1 = new ArrayList<>();
        productosDelCombo1.add(hamburguesaQueso);
        productosDelCombo1.add(papas);
        productosDelCombo1.add(coca);

        Combo comboBase = new Combo("combo base", productosDelCombo1);

        carritoDeMarcos.agregarAlCarrito(comboBase);
        carritoDeMarcos.agregarAlCarrito(comboBase);
        carritoDeMarcos.agregarAlCarrito(hamburguesaVeggie);
        carritoDeMarcos.agregarAlCarrito(pepsiLight);

        System.out.println("El total de " + carritoDeMarcos.getDuenio() + " es: " + carritoDeMarcos.leerTotal());
    }
}
