package C23S;

import java.util.ArrayList;

public class ProgramaIntensivo implements OfertaAcademicaDisponible {
    private String nombre;
    private String descripcion;
    private ArrayList<OfertaAcademicaDisponible> ofertasAcademicas;
    private Double descuento;

    public ProgramaIntensivo(String nombre, String descripcion, Double descuento) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.ofertasAcademicas = new ArrayList<>();
        this.descuento = descuento;
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
        Double precioFinal = 0.0;
        for(OfertaAcademicaDisponible o : this.ofertasAcademicas){
            precioFinal += o.calcularPrecio();
        }
        return precioFinal*(1-this.descuento);
    }

    public void agregarOferta(OfertaAcademicaDisponible o){
        this.ofertasAcademicas.add(o);
    }
}
