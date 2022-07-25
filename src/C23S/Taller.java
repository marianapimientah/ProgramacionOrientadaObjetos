package C23S;

public class Taller implements OfertaAcademicaDisponible {
    private String nombre;
    private String descripcion;

    public Taller(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public Double calcularPrecio() {
        return null;
    }

    @Override
    public String getNombre() {
        return null;
    }
}
