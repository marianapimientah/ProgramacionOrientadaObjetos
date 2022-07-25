package C20S;

public class Semaforo {
    private StateSemaforo estado;

    public Semaforo() {
        this.setEstado(new Verde(this));
    }

    public StateSemaforo getEstado() {
        return estado;
    }

    public void setEstado(StateSemaforo estado) {
        this.estado = estado;
    }

}
