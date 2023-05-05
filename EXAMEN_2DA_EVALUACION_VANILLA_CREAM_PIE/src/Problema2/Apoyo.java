/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

/**
 *
 * @author Uptow
 */
public class Apoyo extends Empleados{
    private int horasSemanales;

    // Constructor sin parámetros
    public Apoyo() {
        super.setSalarioBase(50);
        horasSemanales = 40;
    }

    // Constructor con parámetros
    public Apoyo(String nombre, String apellido, int edad, double salarioBase, int horasSemanales) {
        super(nombre, apellido, edad, salarioBase);
        this.horasSemanales = horasSemanales;
    }

    // Implementación del método para calcular el salario
    public double calcularSalario() {
        double salarioBase = super.getSalarioBase() * horasSemanales;
        double compensacion = salarioBase * 0.5;
        return salarioBase + compensacion;
    }
    
}
