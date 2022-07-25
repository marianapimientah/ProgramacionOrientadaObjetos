package C14S;

public class LibroDigital extends Libro {
    //atributos
    private Double tamanio;
    //constructor

    public LibroDigital(String titulo, Integer codigo, Double precioLista, Double precioPromocion) {
        super(titulo, codigo, precioLista, precioPromocion);
    }

    //metodos

    @Override
    public Double comprimir() {
        return this.tamanio;
    }

    @Override
    public Double vender() {
        return null;
    }
}
