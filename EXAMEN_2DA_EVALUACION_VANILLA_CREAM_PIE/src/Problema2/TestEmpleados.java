/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

/**
 *
 * @author Uptow
 */
public class TestEmpleados {
// Método estático para imprimir el salario de cualquier objeto creado de cualquier clase de Empleados
    public static void imprimirSalario(Empleados empleado) {
        System.out.println("El salario de " + empleado.getNombre() + " " + empleado.getApellido() + " es $" + empleado.calcularSalario());
    }
}