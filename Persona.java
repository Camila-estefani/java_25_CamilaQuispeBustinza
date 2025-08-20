package vallegrande.edu.pe.model;

public class Persona {
    private String nombre;
    private int edad;

    public Persona() {}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método 1: mostrar información (no retorna)
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }

    // Método 2: cambiar estado (cumplir años)
    public void cumplirAnios() {
        this.edad++;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
}
