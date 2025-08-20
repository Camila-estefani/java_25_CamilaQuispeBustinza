package vallegrande.edu.pe.model;

public class Estudiante {
    private String nombre;
    private String carrera;

    // Constructor obligatorio (actividad pide constructor)
    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    // Método 1
    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " | Carrera: " + carrera);
    }

    // Método 2
    public String obtenerDescripcion() {
        return nombre + " - " + carrera;
    }

    // Getters (si los necesitas)
    public String getNombre() { return nombre; }
    public String getCarrera() { return carrera; }
}
