package C10A;

public class CupcakeListo extends Cupcake {
    //atributos

    private String topping;

    //constructor

    public CupcakeListo(String topping, String tipoMasa, String sabor){
        //invoco al constructor del padre:
        super(tipoMasa, sabor);
        this.topping = topping;
    }

    //metodos

    public void serRegalado(){
        System.out.println("Me regalo a ti, mi amor");
    }
}
