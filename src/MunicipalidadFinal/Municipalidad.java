package MunicipalidadFinal;

import java.util.ArrayList;

public class Municipalidad {
    private ArrayList<Gravable> propiedades;

    public Municipalidad(){
        this.propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(Gravable g){
        this.propiedades.add(g);
    }

    public void generarReporte(){
        for(Gravable g : this.propiedades){
            System.out.println("Calle: " + g.getCalle() + " Numero: " + g.getNumero() + " Impuesto: " + g.calcularImpuesto());
        }
    }
}
