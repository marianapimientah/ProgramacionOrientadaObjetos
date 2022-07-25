package C23S;

public class FactoryOfertaAcademica {
    private static FactoryOfertaAcademica instancia;

    private FactoryOfertaAcademica(){

    }

    public static FactoryOfertaAcademica getInstance(){
        if(instancia == null){
            instancia = new FactoryOfertaAcademica();
        }
        return instancia;
    }

    public OfertaAcademicaDisponible crearOfertaAcademica(String s){
        switch (s){
            case "frontend":
                return new Curso("frontend","", 16.0,2,1000.0);
            case "backend":
                return new Curso("backend", "", 20.0, 2, 900.0);
            case "fullstack":
                ProgramaIntensivo fullstack = new ProgramaIntensivo("fullstack","",0.2);
                fullstack.agregarOferta((new Curso("frontend","", 16.0,2,1000.0)));
                fullstack.agregarOferta((new Curso("backend","", 16.0,2,1000.0)));
                return fullstack;
            default:
                return null;
        }
    }
}
