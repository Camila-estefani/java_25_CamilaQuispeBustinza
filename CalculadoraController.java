package vallegrande.edu.pe.controller;

import vallegrande.edu.pe.model.Operacion;

public class CalculadoraController {

    public double sumar(double a, double b) {
        return new Operacion(a, b).sumar();
    }

    public double restar(double a, double b) {
        return new Operacion(a, b).restar();
    }

    public double multiplicar(double a, double b) {
        return new Operacion(a, b).multiplicar();
    }

    public double dividir(double a, double b) {
        return new Operacion(a, b).dividir();
    }
}
