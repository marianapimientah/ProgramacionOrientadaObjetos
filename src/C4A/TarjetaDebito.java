package C4A;

public class TarjetaDebito {
    //Atributos
    private String nombreTitular;
    private int numeroTarjeta;
    private String fechaVencimiento;
    private double saldo;

    //Constructor
    public TarjetaDebito(String nombre, String fechaVencimiento, int numero){
        this.nombreTitular = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.numeroTarjeta = numero;

    }
    //Metodos
    public void setSaldo(double plata){
        this.saldo += plata;
    }

    public String getNombreTitular(){
        return nombreTitular;
    }

    public int getNumeroTarjeta(){
        return numeroTarjeta;
    }

    public String getFechaVencimiento(){
        return fechaVencimiento;
    }

    public double getSaldo(){
        return saldo;
    }

    public void retirar(){
        //logica

    }
    public void comprar(){
        //logica
    }
}
