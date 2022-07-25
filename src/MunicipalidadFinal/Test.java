package MunicipalidadFinal;

public class Test {
    public static void main(String[] args) {
        GravableFactory g = GravableFactory.getInstance();
        Gravable casaUno = g.crearGravable("CasaUno");
        Gravable casaDos = g.crearGravable("CasaDos");
        Gravable barrio = g.crearGravable("Barrio");

        Municipalidad municipalidad = new Municipalidad();
        municipalidad.agregarPropiedad(casaUno);
        municipalidad.agregarPropiedad(casaDos);
        municipalidad.agregarPropiedad(barrio);

        municipalidad.generarReporte();
    }
}
