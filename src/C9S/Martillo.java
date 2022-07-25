package C9S;

public class Martillo {
    private String tipo;
    private boolean encendido;

    public Martillo (String tipo){
        this.tipo = tipo;
    }

    public void martillar(){
        if(encender()){
            System.out.println("Pum pum");
        }
    }

    public boolean encender(){
        this.encendido = true;
        return true;
    }
}
