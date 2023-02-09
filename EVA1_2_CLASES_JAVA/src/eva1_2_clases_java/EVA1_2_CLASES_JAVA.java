
package eva1_2_clases_java;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

public class EVA1_2_CLASES_JAVA {

    public static void main(String[] args) {
        // CLASE ES LA RECETA:
        // OBJETO ES PLATILLO
        // INSTANCIACION:
        // 1.Declarar el identificador para el objeto
        // 2.Asignar memoria con new
        // 3.Invocar su constructor
        // Persona () --> constructor;
        // Constructor --> metodo;
        Persona perso1 = new Persona();
        //System.out.println(perso1);
       
        // ESTA SECCIÓN ES PORQUE INICIAMOS CON LOS
        // ATRIBUTOS CON MODIFICADORES DEFAULT
        /*perso1.nombre = "Poleth";
        perso1.apellido = "Lopez";
        perso1.edad = 18;
        perso1.estadoCivil = false; // false es soltero
        System.out.println(perso1.nombre);
        System.out.println(perso1.apellido);
        System.out.println(perso1.edad);
        System.out.println(perso1.estadoCivil);
        */
        perso1.setNombre("Poleth Elizama");
       // System.out.println(perso1.getNombre());
        perso1.setApellido("Escarcega Lopez");
        perso1.setEdad(18);
        perso1.setEstadoCivil(false);
        //System.out.println(perso1.getNombre());
        //System.out.println(perso1.getApellido());
        //System.out.println(perso1.getEdad());
        //System.out.println(perso1.getEstadoCivil());
        perso1.imprimirDatos();
        // PERSONA 2
        Persona perso2 = new Persona();
        perso2.setNombre("Elizabeth");
        perso2.setApellido("Carrillo Fuentes");
        perso2.setEdad(22);
        perso2.setEstadoCivil(false);
        perso2.imprimirDatos();
        
    }
    
}
