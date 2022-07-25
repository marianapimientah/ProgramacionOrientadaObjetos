package C20S;

public class Amarillo implements StateSemaforo{

    private Semaforo semaforo;

    public Amarillo(Semaforo s) {
        this.semaforo = s;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("AMARILLO: PRECAUCIÓN");

    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Rojo(this.semaforo));
    }
}
