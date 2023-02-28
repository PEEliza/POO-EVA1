
package eva1_16_sobrecarga_2;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
public class EVA1_16_SOBRECARGA_2 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Suma: "+ suma(4,5));
        System.out.println("Suma: "+suma(4.0,5.0));
        System.out.println("Suma: "+suma("Hola","Mundo!!"));
        suma();
    }             
                //SUMA (INT, INT)
   public static int suma(int val1, int val2){
       return val1 + val2;
   }              
                //Suma(double,double)
    public static double suma(double val1, double val2){
       return val1 + val2;
   } 
                //Suma(String,String)
    public static String suma(String val1, String val2){
       return val1 + val2;
   } 
           // Suma()
    public static void suma(){
        System.out.println("Metodo sin parametros suma");  
    }
}
