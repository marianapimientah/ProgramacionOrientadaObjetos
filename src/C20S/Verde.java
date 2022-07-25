package C20S;

public class Verde implements StateSemaforo{

    private Semaforo semaforo;

    public Verde(Semaforo semaforo) {
        this.semaforo = semaforo;
    }

    @Override
    public void mostrarAviso() {
        System.out.println("VERDE: AVANCE");
    }

    @Override
    public void cambiarEstado() {
        this.semaforo.setEstado(new Amarillo(this.semaforo));
    }

    public StateSemaforo getSemaforo(){
        return this.semaforo.getEstado();
    }
}
