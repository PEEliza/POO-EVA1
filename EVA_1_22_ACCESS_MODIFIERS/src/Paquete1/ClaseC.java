
package Paquete1;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

import Paquete2.ClaseE;

public class ClaseC {
       public int publicC;
    int defaultC;
    private int privateC; 
    
    public void Prueba(){
        ClaseA objA = new ClaseA();
        //objA.defaultA;
        //objA.publicA; Atributos visibles
        
        ClaseB objB = new ClaseB();
        //objB.defaultB;
        //objB.publicB; Atributos visibles
        
        ClaseD objD = new ClaseD();
        //objD.defaultD;
        //objD.publicD;
        
      // ClaseE esta en otro paquete y archivo
      // hay que agregar la clausula "import"
        ClaseE objE = new ClaseE();
        //objE.publicE;
        
    }
}


class ClaseD{
       public int publicD;
    int defaultD;
    private int privateD; 
}