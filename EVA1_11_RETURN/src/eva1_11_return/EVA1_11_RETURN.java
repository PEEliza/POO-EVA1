
package eva1_11_return;
// AUTOR: POOLETH E. ESCARCEGA LOPEZ

public class EVA1_11_RETURN {

    public static void main(String[] args) {
        // TODO code application logic here
        int resu;
        resu= square(10); //Invocacion o llamda a funcion
        System.out.println("RESULTADO: " +resu);
    }
    public static int square (int num){
        return num*num;
    }
}
