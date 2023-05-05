package Problema1;

public abstract class Movimiento implements Captura{
    public double velocidadInicial;
    public double velocidadFinal;
    public double aceleracion;
    public double tiempo;

    public Movimiento(){ //CONSTRUCTOR SIN PARAMETROS
        this.velocidadInicial = 0.0;
        this.velocidadFinal = 0.0;
        this.aceleracion = 0.0;
        this.tiempo = 0.0;
    }

    public Movimiento(double velocidadInicial, double velocidadFinal, double aceleracion, double tiempo){
        //COSTRUCTOR CON PARAMETROS
        this.velocidadInicial = velocidadInicial;
        this.velocidadFinal = velocidadFinal;
        this.aceleracion = aceleracion;
        this.tiempo = tiempo;
    }

    //SE IMPLEMENTAN LOS METODOS GET Y SET DE LA 
    //INTERFACE Captura
    @Override
    public double getAceleracion() {
        return aceleracion;
    }
    @Override
    public double getTiempo() {
        return tiempo;
    }

    @Override
    public double getVelocidadFinal() {
        return velocidadFinal;
    }

    @Override
    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    @Override
    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    @Override
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public void setVelocidadFinal(double velocidadFinal) {
        this.velocidadFinal = velocidadFinal;
    }

    @Override
    public void setVelocidadInicial(double velocidadInicial) {
        this.velocidadInicial = velocidadInicial;
    }

    //SE CREA EL METODO ABSTRACTO CalcularDistancia
    public abstract double CalcularDistancia();
    
    
}
