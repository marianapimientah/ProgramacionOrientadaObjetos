package MunicipalidadFinal;

public class GravableFactory {
    private static GravableFactory instancia;

    private GravableFactory(){

    }

    public static GravableFactory getInstance(){
        if(instancia == null){
            instancia = new GravableFactory();
        }
        return instancia;
    }

    public Gravable crearGravable(String s){
        switch (s){
            case "CasaUno":
                return new Casas("Av.San Martin",130, 500.0);
            case "CasaDos":
                return new Casas("Mitre", 233,700.0);
            case "Barrio":
                BarriosCerrados barriosCerrados = new BarriosCerrados("Gutierres",330,2);
                barriosCerrados.agregarGravable(new Casas("Av.San Martin",130, 500.0));
                barriosCerrados.agregarGravable(new Casas("Mitre", 233,700.0));
                return barriosCerrados;
            default:
                return null;
        }
    }
}
