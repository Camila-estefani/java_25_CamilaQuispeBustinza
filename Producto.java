package vallegrande.edu.pe.model;

public class Producto {
    private String nombre;
    private double precio;

    public Producto() {}

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método con parámetro que aplica descuento (porcentaje 0..100)
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0) return;
        this.precio = precio - (precio * (porcentaje / 100.0));
    }

    // Método con parámetro que aumenta el precio en una cantidad fija
    public void aumentarPrecio(double cantidad) {
        this.precio += cantidad;
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: " + precio);
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
