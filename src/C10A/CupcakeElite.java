package C10A;

public class CupcakeElite extends Cupcake{
    private String dobleSabor;

    public CupcakeElite(String tipoMasa, String sabor, String dobleSabor) {
        super(tipoMasa, sabor);
        this.dobleSabor = dobleSabor;
    }

    @Override
    public void serComido(){
        System.out.println("Estoy siendo comido con cuchillo y tenedor");
    }
    public void serComido(String nombre){
        System.out.println(nombre + " esta comiendo el cupcake con cuchillo y tenedor");
    }
}
