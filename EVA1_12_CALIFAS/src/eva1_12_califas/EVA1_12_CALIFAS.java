
package eva1_12_califas;


public class EVA1_12_CALIFAS {

    
    public static void main(String[] args) {
        // TODO code application logic here
    String cali;
    cali= califs(85);// Almaceno el resultado
        System.out.println("CALIFS PARA 85: " + cali);
        System.out.println("CALIFS PARA 70: "+ califs (70)); // Invoco desde otra funcion
        califs(100); // Ignoro el resultado
    }
public static String califs(int califs){
    
   String resu ="";
    if ((califs >=91) && (califs<=100)){
        resu ="A";
    }else if ((califs >=81) && (califs<=90)){
        resu = "B";
    } else if ((califs >=71) && (califs<=80)){
        resu = "C";
    } else{
        resu= "D";
    }
   return resu;

}
}
