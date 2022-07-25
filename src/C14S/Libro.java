package C14S;

public abstract class Libro implements Enviable {
    //atributos
    private String titulo;
    private Integer codigo;
    private Double precioLista;
    private Double precioPromocion;

    //constructor

    public Libro(String titulo, Integer codigo, Double precioLista, Double precioPromocion) {
        this.titulo = titulo;
        this.codigo = codigo;
        this.precioLista = precioLista;
        this.precioPromocion = precioPromocion;
    }

    //metodos

    public Double getPrecioLista() {
        return precioLista;
    }

    public abstract Double comprimir();
    public abstract Double vender ();

    @Override
    public boolean enviar() {
        return false;
    }
}
