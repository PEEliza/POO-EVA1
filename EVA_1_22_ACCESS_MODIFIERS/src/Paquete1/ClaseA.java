
package Paquete1;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

import Paquete2.ClaseE; 


public class ClaseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void Prueba(){
    ClaseB objB = new ClaseB();
    // objB.defaultB; 
    //objB.publicB; Atributos visibles
   
    ClaseC objC = new ClaseC();
    //objC.defaultC; 
    //objC.publicC; Atributos visibles
    
    // Clase D es default en otro archivo
    // pero mismo paquete
    ClaseD objD = new ClaseD();
    //objD.defaultD;
    //objD.publicD; Atributos visibles
    
    // ClaseE esta en otro paquete y archivo
    // Hay que agregar la clausula "import"
    ClaseE objE = new ClaseE();
    //objE.publicE; Solo el atributo publico
    
    //ClaseF objF = new ClaseF;
    //Clase F es default y es invisible
    // para las clases de estte Paquete1
    }
}
class ClaseB{
    public int publicB;
    int defaultB;
    private int privateB;
}