package C21S;

public interface StateOrden {
    void valorPresupuesto(Double precio);
    void sumarRepuesto(Double precioRepuesto);
    void cambiarDireccion(String direccion);
    void pasarSigPaso();
}
