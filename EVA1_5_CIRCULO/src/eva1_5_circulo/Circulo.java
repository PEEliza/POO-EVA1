package eva1_5_circulo;
// AUTOR: POLETH E. ESCARCEGA LOPEZ

public class Circulo {

    // ATRIBUTOS DE LA CLASE
    private double area, perimetro, radio;
    private double Pi;
    private double diametro;

    // CONSTRUCTORES
    public Circulo() {
        Pi = (float) 3.1416;
        diametro = 10;
        radio = 5;
        area = 0;
        perimetro = 0;
    }
    

    public void calcularArea() {
        area = Pi * radio * radio;
        System.out.println("EL AREA ES: " + area);
    }

    public void calcularPerimetro() {
        perimetro = Pi * diametro;
        System.out.println("EL PERIMETRO ES: " + perimetro);
    }

// COMPORTAMIENTO GET Y SET 
    public double getRadio() {
        return radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setRadio(double valor) {
        radio = valor;
    }

    public void setDiametro(double valor) {
        diametro = valor;
    }

    public void setArea(double valor) {
        area = valor;
    }

    public void setPerimetro(double valor) {
        perimetro = valor;
    }

}
