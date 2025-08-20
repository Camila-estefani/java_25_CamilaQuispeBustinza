package vallegrande.edu.pe.model;

public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {}

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Retorna el área
    public double calcularArea() {
        return base * altura;
    }

    // Retorna el perímetro
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Getters y setters
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
}
