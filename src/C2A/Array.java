package C2A;

public class Array {
    public static void main(String[] args) {

        String[] nombres = new String[5];

        nombres[0] = "Juan";
        nombres[1] = "Mario";
        nombres[2] = "Carlos";

        /*acceder a un elemento por su indice*/
        System.out.println(nombres[0]);

        /*descomentar y ver que sucede accediendo a una posicion fuera de rango*/
        //System.out.println(nombres[7]);

        /*recorrer un array con un ciclo for*/
        for(int i = 0; i<nombres.length; i++)
            System.out.println(nombres[i]);

        /*recorrer un array con un ciclo while*/
        int i = 0;
        while(i < nombres.length) {
            System.out.println(nombres[i]);
            i++;
        }

        /*recorrer un array con un ciclo for each*/
        for(String nombre : nombres)
            System.out.println(nombre);

        //  double [] arra = new double[6];
        //        arra[0]=1.2;
        //        arra[1]=1.7;
        //        arra[2]=1.1;
        //        arra[3]=0.3;
        //        arra[4]=3.6;
        //        arra[5]=0.4;
        //
        //        Arrays.sort(arra);
    }
}
