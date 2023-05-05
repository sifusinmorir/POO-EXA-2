package Problema1;

public class Formula3 extends Movimiento{
    public Formula3(){
        super();
    }
    
    public Formula3(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo){
        super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
    }

    @Override
    public double CalcularDistancia() {
        return (getVelocidadFinal() - getVelocidadInicial()) / (2 * getAceleracion());
    }
    
}
