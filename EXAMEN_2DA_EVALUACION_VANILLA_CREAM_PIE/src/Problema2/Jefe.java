/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

/**
 *
 * @author Uptow
 */
public class Jefe extends Empleados {

    // Constructor sin parámetros
    public Jefe() {
        super.setSalarioBase(5000);
    }

    // Constructor con parámetros
    public Jefe(String nombre, String apellido, int edad, double salarioBase) {
        super(nombre,apellido, edad, salarioBase);
        
        
    }
    // Implementación del método para calcular el salario
    public double calcularSalario() {
    return super.getSalarioBase();
    }
}