package C8A;

public class Program {
    public static void main(String[] args) {
        MascotaSimple firulais = new MascotaSimple("perro", 12.5);
        firulais.serAtendido();

        MascotaSimple toby = new MascotaSimple("gato", 7.6);
        toby.serAtendido();
    }
}
