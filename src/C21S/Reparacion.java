package C21S;

public class Reparacion implements StateOrden {
    private Orden orden;

    public Reparacion(Orden orden) {
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
        orden.setEstado(new ParaEnvio(orden));
    }
}
