/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Problema2;

/**
 *
 * @author Uptow
 */
public abstract class Empleados {
    private String nombre;
    private String apellido;
    private int edad;
    private double salarioBase;

    // Constructor sin parámetros
    public Empleados() {
    }

    // Constructor con parámetros
    public Empleados(String nombre, String apellido, int edad, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    // Implementación de los métodos de la interfaz Capturando
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();
}