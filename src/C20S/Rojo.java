package C20S;

public class Rojo implements StateSemaforo{

    private Semaforo semaforo;

    public Rojo(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("ROJO: DETENGASE");

    }

    @Override
    public void cambiarEstado() {
        semaforo.setEstado(new Verde(this.semaforo));
    }
}
