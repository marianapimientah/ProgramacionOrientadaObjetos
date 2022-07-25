package C9S;

public class Program {
    public static void main(String[] args) {

        Martillo martilloMetal = new Martillo("metal");

        Carpintero alberto = new Carpintero("Alberto", martilloMetal);

        alberto.fabricarMesa();
    }
}
