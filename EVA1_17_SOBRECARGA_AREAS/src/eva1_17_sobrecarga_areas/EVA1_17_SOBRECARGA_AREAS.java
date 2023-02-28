
package eva1_17_sobrecarga_areas;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
public class EVA1_17_SOBRECARGA_AREAS {

 
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("AREA DEL CIRCULO: "+ areas(5.5));
        System.out.println("AREA DEL TRIANGULO: "+areas(10.50,15.50));
        System.out.println("AREA DEL TRAPECIO: "+areas(20.25,25.50,30.10));
    }
   public static double areas(double radio){
       return Math.PI*(radio*radio);
   }
   public static double areas(double base, double altura){
       return (base*altura)/2.0;
   }
   public static double areas(double base1,double base2, double alt){
       return  alt*(base1+base2)/2.0;
   }
}
