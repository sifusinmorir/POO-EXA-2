package Problema1;

public class Formula2 extends Movimiento{
    public Formula2(){
        super();
    }
    
    public Formula2(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo){
        super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
    }

    @Override
    public double CalcularDistancia() {
        return ((getVelocidadInicial() + getVelocidadFinal())/2) * getTiempo();
    }
    
}
