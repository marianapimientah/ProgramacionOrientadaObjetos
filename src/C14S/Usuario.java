package C14S;

public class Usuario {
    //atributos
    private String nombre;
    private String domicilio;
    private Integer edad;
    private Libro libro;

    //constructor

    public Usuario(String nombre, String domicilio, Integer edad, Libro Libro) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.edad = edad;
        this.libro = Libro;
    }

    //metodos
}
