package C23S;

import java.util.ArrayList;

public class Instituto {
    private ArrayList<OfertaAcademicaDisponible> ofertasVendidas;

    public Instituto() {
        this.ofertasVendidas = new ArrayList<>();
    }

    public void generarInforme(){
        for(OfertaAcademicaDisponible o : this.ofertasVendidas){
            System.out.println("El costo de " + o.getNombre() + " es: " + o.calcularPrecio());
        }
    }

    public void agregarCursos(OfertaAcademicaDisponible o) {
        this.ofertasVendidas.add(o);
    }
}
