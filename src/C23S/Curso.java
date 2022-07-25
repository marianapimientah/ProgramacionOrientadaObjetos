package C23S;

public class Curso implements OfertaAcademicaDisponible {
    private String nombre;
    private String descripcion;
    private Double horasMensuales;
    private Integer mesesDuracion;
    private Double precioPorHora;

    public Curso(String nombre, String descripcion, Double horasMensuales, Integer mesesDuracion, Double precioPorHora) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horasMensuales = horasMensuales;
        this.mesesDuracion = mesesDuracion;
        this.precioPorHora = precioPorHora;
    }
    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Double calcularPrecio() {
        Double precioDelCurso = this.horasMensuales*this.precioPorHora*this.mesesDuracion;
        return precioDelCurso;
    }
}
