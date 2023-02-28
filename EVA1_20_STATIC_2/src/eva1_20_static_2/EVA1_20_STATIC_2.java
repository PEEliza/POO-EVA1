
package eva1_20_static_2;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
public class EVA1_20_STATIC_2 {

    public static void main(String[] args) {
        // TODO code application logic here
   /* final int x;
    x = 100;
    x = 200;*/
   FormulasGeometria formulas = new FormulasGeometria();
   //formulas. NO EXISTE NINGÚN MÉTODO DENTRO DEL OBJETO
        System.out.println("MI PI: " + FormulasGeometria.PI);
        System.out.println("AREA DEL TRIANGULO: " + FormulasGeometria.areaTriangulo(5.0, 10.0));
        System.out.println("VOLUMEN DE UNA ESFERA: " + FormulasGeometria.volumenEsfera(15));
    }
    
}
