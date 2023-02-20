
package eva1_6_automovil;
//AUTOR: POLETH E. ESCARCEGA LOPEZ

public class auto {
    private String marca;
    private String model;
    private String placas;
    private int anio;
    private String propet;
    
// DEFAULT
    public auto(){
    marca="GMC";
    model="DELANY";
    placas="74AMG-2";
    anio=2011;
    propet="ELIZA";
}
 // CONSTRUCTOR
    public auto(String marcaAuto, String modelAuto,int anioAuto,String placasAuto,String propetAuto){
        marca= marcaAuto;
        model= modelAuto;
        placas= placasAuto;
        anio= anioAuto;
        propet= propetAuto;
    }
    public int calcularAdeudo(){
        int adeudo = 0;
        if (anio <= 2000){
        adeudo= 1500;
    }
        else if ((anio>=2001) && (anio<=2005)){
            adeudo= 2000;
        }
        else if ((anio>=2006) && (anio<=2010)){
            adeudo= 2500;
        } 
        else if ((anio>=2011) && (anio<=2015)){
            adeudo= 3000;
        }
        else {
        adeudo= 4000;
    }
      return adeudo;
   }
    
// COMPORTAMIENTO GET Y SET
    public String getMarca(){
        return marca;
    }
    public String getModel(){
        return model;
    }
    public String getPlacas(){
        return placas;
    }
    public int getAnio(){
        return anio;
    }
    public String getPropet(){
        return propet;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public void setModel(String valor){
        model = valor;
    }
    public void setPlacas(String valor){
        placas = valor;
    }
    public void setAnio(int valor){
        anio = valor;
    }
    public void setPropet(String valor){
        propet = valor;
    }
    public void imprimirDatos(){
        System.out.println("\nADEUDO VEHICULAR: ");
        System.out.println("MARCA: " + marca);
        System.out.println("MODELO: " + model);
        System.out.println("PLACAS: " + placas);
        System.out.println("ANIO: " + anio);
        System.out.println("PROPETARIO: " + propet);
        System.out.println("ADEUDO: " + calcularAdeudo());
    }
}
