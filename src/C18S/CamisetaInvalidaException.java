package C18S;

public class CamisetaInvalidaException extends Exception{
    public CamisetaInvalidaException(){
        super();
    };
    public CamisetaInvalidaException(String mensaje){
        super(mensaje);
    }
}
