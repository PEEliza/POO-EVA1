
package eva1_13_alcance;
// AUTOR POLETH E. ESCARCEGA LOPEZ
public class EVA1_13_ALCANCE {

    public static void main(String[] args) {
        // TODO code application logic here
        int x = 100;
        for (int i = 0; i < 10; i++) { // INICIA EL CICLO FOR
            System.out.println("x = " + x); // Visible dentro del for
                                            // Dentro del main()
            System.out.println("i = " + i);
            System.out.println("j = "+ j); // Variable no visible 
                                           // no esta declaradada antes de la
                                           // instrucción
        
        int j = 100; // APARTIR DE AQUI, ES VISIBLE.
            System.out.println("j = " + j);
            {
                int z = 100;
                System.out.println("z = " + z);
            }
            System.out.println("z = " + z); // Fuera del bloque
        }// TERMINA BLOQUE FOR
        
    // No estan declaradas dentro del bloque
        System.out.println("i = " + i); 
        System.out.println("j = " + j);
    }
    public static void algo(){
        System.out.println("x = " + x); // NO es visible en algo()
    }
}
