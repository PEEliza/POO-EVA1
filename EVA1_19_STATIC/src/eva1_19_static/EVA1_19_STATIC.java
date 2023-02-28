package eva1_19_static;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
public class EVA1_19_STATIC {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("PI"+ Math.PI);   
        System.out.println(" Número aletorio: " + Math.random());
        Utilerias Utileria = new Utilerias();
        Utileria.Saludo();
        Utileria.OtroSaludo();
        Saludo2(); // SI NO ES ESTATICO Y NO SE HA CREADO
        // UN OBJETO , EL MÉTODO NO EXISTE.
        
    }
    public void Saludo2(){
        System.out.println("HOLA");
    }
}
class Utilerias{
//Saludo(): ESTE MÉTODO EXISTE HASTA QUE SE CREA UN OBJETO  
// CLASE. SOLO SE USA A TRAVÉS DE UN OBJETO.
    public void Saludo(){
     System.out.println("Hola!!");
 } 
// OtroSaludo(): ESTE MÉTODO EXISTE EN EL MOMENTO QUE EL PROGRAMA
// INICIA SU EJECUCIÓN. NO NECESITA QUE CREE UN ONJETO DE
// CLASE PARA PODERLO UTILIZAR . SE USA A TRAVÉS DE LA CLASE.
 public void OtroSaludo(){
     System.out.println("Otro saludo (static)");
 }

}
class OtraClase{
    
}