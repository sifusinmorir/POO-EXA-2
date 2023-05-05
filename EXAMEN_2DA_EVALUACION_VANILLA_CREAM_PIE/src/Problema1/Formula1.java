package Problema1;

public class Formula1 extends Movimiento {
    public Formula1(){//costructor sin parametros 
        super();
    }

    public Formula1(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo){//costructor con parametros
        super(velocidadInicial, velocidadFinal, aceleracion, tiempo);
    }

    @Override
    public double CalcularDistancia() {//implementacion del metodo CalcularDistancia
        return (getVelocidadInicial() * getTiempo()) + ((getAceleracion() * Math.pow(getTiempo(), 2))/2);//una de muchas formas de exprear la ecuacion 
    }
}
