package C21S;

public class Finalizado implements StateOrden {
    private Orden orden;

    public Finalizado(Orden orden) {
        this.orden = orden;
    }

    @Override
    public void valorPresupuesto(Double precio) {

    }

    @Override
    public void sumarRepuesto(Double precioRepuesto) {

    }

    @Override
    public void cambiarDireccion(String direccion) {

    }

    @Override
    public void pasarSigPaso() {


    }
}
