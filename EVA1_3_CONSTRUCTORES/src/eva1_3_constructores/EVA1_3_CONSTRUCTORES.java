
package eva1_3_constructores;
// AUTOR: POLETH E. ESCARCEGA LOPEZ
public class EVA1_3_CONSTRUCTORES {

    public static void main(String[] args) {
        // TODO code application logic here

/*
        Clase CuentaBancaria
        String numero de cuenta
        Double saldo
        String cliente
*/
//CuentaBancaria cuenta1 = new CuentaBancaria();
CuentaBancaria cuenta1 = new CuentaBancaria("2", 40000, "Carlos Slim");
//cuenta1.setNCliente("Carlos Slim");
//cuenta1.setNCuenta("1");
//cuenta1.setSaldo(400000);

System.out.println("DATOS DEL  CLIENTE");
String nombre = cuenta1.getNCliente();
System.out.println(nombre);
System.out.println(cuenta1.getNCuenta());
System.out.println(cuenta1.getSaldo());

// CUENTA 2
CuentaBancaria cuenta2 = new CuentaBancaria ("3", 15000, "Poleth Lopez");
System.out.println("\nDATOS DEL  CLIENTE");
System.out.println(cuenta2.getNCliente());
System.out.println(cuenta2.getNCuenta());
System.out.println(cuenta2.getSaldo());

//CUENTA 3
CuentaBancaria cuenta3 = new CuentaBancaria();
System.out.println("\nDATOS DEL  CLIENTE");
System.out.println(cuenta3.getNCliente());
System.out.println(cuenta3.getNCuenta());
System.out.println(cuenta3.getSaldo());
}
    }
    
    
    

