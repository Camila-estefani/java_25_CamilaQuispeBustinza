package vallegrande.edu.pe;

import vallegrande.edu.pe.model.*;

public class TestModels {
    public static void main(String[] args) {
        System.out.println("=== Actividad 2: Persona ===");
        Persona p = new Persona("Ana", 20); // objeto con datos
        p.mostrarInfo();
        p.cumplirAnios();
        p.mostrarInfo();

        System.out.println("\n=== Actividad 3: Rectangulo ===");
        Rectangulo r = new Rectangulo(5, 3); // objeto con datos
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());

        System.out.println("\n=== Actividad 4: Producto ===");
        Producto prod = new Producto("Teclado", 120.0); // objeto con datos
        prod.mostrarProducto();
        prod.aplicarDescuento(10); // método con parámetro
        prod.mostrarProducto();
        prod.aumentarPrecio(5);
        prod.mostrarProducto();

        System.out.println("\n=== Actividad 5: Estudiante ===");
        Estudiante est = new Estudiante("Carlos", "Ingeniería"); // objeto con constructor
        est.mostrarInfo();
        System.out.println("Descripción: " + est.obtenerDescripcion());
    }
}
