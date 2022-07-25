package C5S;

public class Cupcake {
    //atributos
    private String tamanio;
    private static double precio = 0;
    private String sabor;
    private String topping;
    private boolean decorado;
    private Double cualquierNumeroDecimal;

    //constructor
    public Cupcake(String tamanio, String sabor, String topping, boolean decorado){
        this.tamanio = tamanio;
        this.sabor = sabor;
        this.topping = topping;
        this.decorado = decorado;
    }

    //metodos
    public String getTamanio (){
        return tamanio;
    }
    public void setTamanio (String tamanio){
        this.tamanio = tamanio;
    }
    public double getPrecio (){
        return precio;
    }
    public void setPrecio (double precio){
        this.precio = precio;
    }
    public String getSabor (){
        return sabor;
    }
    public void setSabor (String sabor){
        this.sabor = sabor;
    }
    public String getTopping (){
        return topping;
    }
    public void setTopping (String topping){
        this.topping = topping;
    }
    public boolean getDecorado (){
        return decorado;
    }
    public void setDecorado (boolean decorado){
        this.decorado = decorado;
    }

    public static void setearPrecio(double precio){
        Cupcake.precio = precio;
    }
}
