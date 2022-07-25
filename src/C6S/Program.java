package C6S;

public class Program {
    public static void main(String[] args) {
        Impresoras impresora = new Impresoras("HP",true);
        impresora.setCantidadHojas(null);

        System.out.println("La marca de su impresora es: " + impresora.getModelo());

        impresora.imprimir("--Esta impresion es de prueba");

    }
}