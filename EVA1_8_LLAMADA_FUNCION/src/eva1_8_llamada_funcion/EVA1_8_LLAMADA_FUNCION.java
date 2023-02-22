
package eva1_8_llamada_funcion;
// AUTOR: POLETH E.ESCARCEGA LOPEZ
public class EVA1_8_LLAMADA_FUNCION {

 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("INICIA main()");
       A(); // LLAMADA FUNCIÓN
        System.out.println("TERMINA main()");
    }
    public static void A(){
        System.out.println("INICIA A()");
        B(); //LLAMADA FUNCIÓN
        System.out.println("TERMINA A()");
    }
     public static void B(){
        System.out.println("INICIA B()");
        System.out.println("TERMINA B()");
    }
}
