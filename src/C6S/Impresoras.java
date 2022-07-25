package C6S;

import java.util.Date;

public class Impresoras {
    //atributos
    private String modelo;
    private boolean esInalambrica;
    private Date fechaFabricacion;
    private Integer cantidadHojas;

    //constructor
    public Impresoras(String modelo, boolean inalambrica){
        this.modelo = modelo;
        this.esInalambrica = inalambrica;
    }

    //metodos
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEsInalambrica() {
        return esInalambrica;
    }

    public void setEsInalambrica(boolean esInalambrica) {
        this.esInalambrica = esInalambrica;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(Date fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public Integer getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(Integer cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    private boolean hayHojas(){
        if(cantidadHojas>0){
            return true;
        }else {
            return false;
        }
    }
    public void imprimir(String texto){
        System.out.println(texto);
        if(cantidadHojas != null){
            if(hayHojas()){
                this.cantidadHojas --;
            } else {
                System.out.println("No hay hojas para imprimir");
            }
        }else{
            System.out.println("Prenda la impresora");
        }
    }
}
