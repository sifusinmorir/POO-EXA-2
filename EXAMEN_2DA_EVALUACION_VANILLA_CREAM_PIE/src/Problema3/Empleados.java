package Problema3;
public abstract class Empleados {
    private int ID;
    private String nombre;
    private double salario;

    // Constructores
    public Empleados() {}

    public Empleados(int ID, String nombre, double salario) {
        this.ID = ID;
        this.nombre = nombre;
        this.salario = salario;
    }

    // Getters y Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();
}
