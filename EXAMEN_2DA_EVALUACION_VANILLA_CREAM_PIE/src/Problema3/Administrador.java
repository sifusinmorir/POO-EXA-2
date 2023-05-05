package Problema3;
public class Administrador extends EmpleadoTiempoCompleto implements ElegibleParaBono {
    private double porcentajeDelBono;

    // Constructores
    public Administrador() {}

    public Administrador(int ID, String nombre, double salario, double porcentajeDelBono) {
        super(ID, nombre, salario);
        this.porcentajeDelBono = porcentajeDelBono;
    }

    // Getters y Setters
    public double getPorcentajeDelBono() {
        return porcentajeDelBono;
    }

    public void setPorcentajeDelBono(double porcentajeDelBono) {
        this.porcentajeDelBono = porcentajeDelBono;
}
    @Override
public double calcularBono() {
    return getSalario() * (getPorcentajeDelBono() / 100);
}

// Implementación del método abstracto para calcular el salario
@Override
public double calcularSalario() {
    return getSalario() + calcularBono();
}
}