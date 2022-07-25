package C21S;

public class Presupuesto implements StateOrden {
    private Orden orden;

    public Presupuesto(Orden orden) {
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
        orden.setEstado(new Reparacion(orden));

    }
}
