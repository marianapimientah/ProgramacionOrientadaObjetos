package C11A;

import java.util.Date;

public abstract class Impresora {
    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;
    private double porcentajeTinta;

    public Impresora(String modelo, int hojasDisponibles, double porcentajeTinta) {
        this.modelo = modelo;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = porcentajeTinta;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    public boolean  tienePapel(){
        return this.hojasDisponibles > 0;
    }
    public boolean necesitaTinta(){
        return this.porcentajeTinta < 10;
    }

    public abstract String imprimir();

}
