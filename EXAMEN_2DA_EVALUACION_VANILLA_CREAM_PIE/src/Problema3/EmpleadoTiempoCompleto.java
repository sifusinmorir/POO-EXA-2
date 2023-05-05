package Problema3;
public class EmpleadoTiempoCompleto extends Empleados {
    public EmpleadoTiempoCompleto() {}

    public EmpleadoTiempoCompleto(int ID, String nombre, double salario) {
        super(ID, nombre, salario);
    }

    // Implementación del método abstracto para calcular el salario
    @Override
    public double calcularSalario() {
        return getSalario();
    }
}
