
package eva1_2_clases_java;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

public class Persona {
    // ATRIBUTOS DE LA CLASE --> ESTADO
   private String nombre;
   private String apellido;
   private int edad;
   private boolean estadoCivil;
    // METODOS: COMPORTAMIENTO
   // Lectura y escritura de atributos:
   // Métodos get --> leer, método set --> escribir
   // Modificador valor de retorno nombre(argumentos)(implementación)
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String valor){
      nombre= valor; 
      }
   public String getApellido(){
       return apellido;
   }
   public void setApellido(String valor){
      apellido= valor; 
      }
   public int getEdad(){
       return edad;
   }
   public void setEdad(int valor){
      edad= valor; 
   }
   public boolean getEstadoCivil(){
       return estadoCivil;
   }
   public void setEstadoCivil(boolean valor){
      estadoCivil= valor; 
      }
   public void imprimirDatos(){
       System.out.println("\nDATOS ALMACENADOS");
                  // Concatenación
                  // + suma (números) + concatena <-- sobrecarga de operadores 
       System.out.println("Nombre completo: " + nombre + " " + apellido);
       System.out.println("Edad: " + edad);
       if(estadoCivil)
           System.out.println("Estado civil: casado");
       else
           System.out.println("Estado civil: soltero");
   }
   
}
