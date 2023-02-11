
package eva1_3_constructores;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

public class CuentaBancaria {
// ATRIBUTOS DE LA CLASE
  private  String nCuenta;
  private  double saldo;
  private  String nCliente;
//CONSTRUCTORES 
// Default y con argumentos
  public CuentaBancaria(){ //CONSTRUCTOR
    nCuenta = "----";
    saldo = 0;
    nCliente = "----";
    }
  public CuentaBancaria(String nuCuenta, double otSaldo, String noCliente){
      nCuenta = nuCuenta;
      saldo = otSaldo;
      nCliente = noCliente;
  }
// COMPORTAMIENTO
  // MÉTOS GET Y SET
  public String getNCuenta(){
  return nCuenta;
  }
  public double getSaldo(){
  return saldo;
  }
  public String getNCliente(){
  return nCliente;
  }
  public void setNCuenta (String valor){
      nCuenta= valor;
  }
  public void setSaldo (double valor){
      saldo= valor;
  }
  public void setNCliente (String valor){
      nCliente= valor;
  }

}
