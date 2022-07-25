package MunicipalidadFinal;

public class Casas implements Gravable {
    private String calle;
    private Integer numero;
    private Double montoBaseImpuesto;

    public Casas(String calle, Integer numero, Double montoBaseImpuesto) {
        this.calle = calle;
        this.numero = numero;
        this.montoBaseImpuesto = montoBaseImpuesto;
    }

    @Override
    public Double calcularImpuesto() {
        if(calle.equals("Av.San Martin")){
            return (this.montoBaseImpuesto+(this.montoBaseImpuesto*0.10));
        } else {
            return this.montoBaseImpuesto;
        }
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
