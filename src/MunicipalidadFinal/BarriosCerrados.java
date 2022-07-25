package MunicipalidadFinal;

import java.util.ArrayList;

public class BarriosCerrados implements Gravable{
    private String calle;
    private Integer numero;
    private Integer factorMultiplicador;
    private ArrayList<Gravable> gravables;

    public BarriosCerrados(String calle, Integer numero, Integer factorMultiplicador) {
        this.calle = calle;
        this.numero = numero;
        this.factorMultiplicador = factorMultiplicador;
        this.gravables = new ArrayList<>();
    }

    public void agregarGravable(Gravable g){
        this.gravables.add(g);
    }

    @Override
    public Double calcularImpuesto() {
        Double impuestoTotal = 0.0;
        for(Gravable g : this.gravables){
            impuestoTotal += g.calcularImpuesto();
        }
        return impuestoTotal*this.factorMultiplicador;
    }

    @Override
    public String getCalle() {
        return this.calle;
    }

    @Override
    public Integer getNumero() {
        return this.numero;
    }
}
