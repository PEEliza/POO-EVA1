
package eva_4_tv;
//AUTOR: POLETH E. ESCARCEGA LOPEZ

public class Tv {
private int volumen;
private int canal;
private boolean poder;

//CONSTRUCTORES
public Tv(){ //CONSTRUCTOR DEFAULT
  volumen = 2;
  canal = 0 ;
  poder = false; //apagado  
}
// MÉTODOS PARA OPERAR LA TV (INTERFAZ)
// encender y apagar la TV
public void cambiarEstadoPoder(){
   // VERIFICAR EL ESTADO DE LA TV
   if(poder == true){
       poder = false;
       System.out.println("PANTALLA APAGADA");
   }else {
       poder= true;
       System.out.println("PANTALLA ENCENDIDA");
   }
  
   
}
// VOLUMEN
public void subirVolumen(){
  if (poder == true){ // La TV esta prendida
    if(volumen < 100){
      volumen = volumen +1; // acumulador
    System.out.println("Volumen: " + volumen);
    }
  }
}
public void bajarVolumen(){
  if (poder == true){
    if (volumen > 0){
     volumen = volumen -1; // acumulador
  System.out.println("Volumen: " + volumen);
   } 
   }  
}
public void subirCanal (){
    if (poder == true){
        canal = canal +1;
       
        if (canal > 100){
            canal = 0;
        System.out.println("Canal: " + canal);}
    }
}
public void bajarCanal(){
    if (poder == true)
        canal = canal -1;
    
    if (canal < 0){
        canal = 100;
        System.out.println("Canal: " + canal);
        }
    
}
            
        
}

