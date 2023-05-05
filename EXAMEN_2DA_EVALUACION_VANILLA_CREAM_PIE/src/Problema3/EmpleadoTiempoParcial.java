package Problema3;
public class EmpleadoTiempoParcial extends Empleados {
    private double pagoPorHora;
    private double horasTrabajadas;

    // Constructores
    public EmpleadoTiempoParcial() {}

    public EmpleadoTiempoParcial(int ID, String nombre, double salario, double pagoPorHora, double horasTrabajadas) {
        super(ID, nombre, salario);
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Getters y Setters
    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return getPagoPorHora() * getHorasTrabajadas();
    }
}
