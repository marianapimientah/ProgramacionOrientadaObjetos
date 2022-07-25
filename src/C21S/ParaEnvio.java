package C21S;

public class ParaEnvio implements StateOrden {
    private Orden orden;

    public ParaEnvio(Orden orden) {
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
        orden.setDireccion(direccion);
    }

    @Override
    public void pasarSigPaso() {
        orden.setEstado(new Finalizado(orden));
    }
}
