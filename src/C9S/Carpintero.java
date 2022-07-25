package C9S;

public class Carpintero {
    private String nombre;
    private String direccionTaller;
    private Martillo martillo;

    public Carpintero(String nombre, Martillo martilloMetal) {
        this.nombre = nombre;
        this.martillo = martilloMetal;
    }

    public void fabricarMesa(){
        System.out.println("Soy " + this.nombre + " y estoy fabricando una mesa");
        this.martillo.martillar();
        this.martillo.encender();
    }
}
