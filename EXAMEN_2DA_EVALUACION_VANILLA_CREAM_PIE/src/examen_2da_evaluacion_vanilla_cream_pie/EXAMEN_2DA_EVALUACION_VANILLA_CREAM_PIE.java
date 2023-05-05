package examen_2da_evaluacion_vanilla_cream_pie;

import DatosIntegrantes.Integrantes;
import Problema1.Formula1;
import Problema1.Formula2;
import Problema1.Formula3;
import Problema2.Apoyo;
import Problema2.Manufactura;
import Problema3.Administrador;
import Problema3.EmpleadoTiempoCompleto;
import Problema3.EmpleadoTiempoParcial;
import Problema2.Jefe;
import static Problema2.TestEmpleados.imprimirSalario;

public class EXAMEN_2DA_EVALUACION_VANILLA_CREAM_PIE {

    public static void main(String[] args) {
        System.out.println("\n------------------------------------------\n");

        ////////////////////////////
        Integrantes.imprimirDatosEquipo();
        Integrantes.imprimirProblemasResueltos();
        //////////////////////////

        System.out.println("\n------------------------------------------");

        //PROBLEMA 1
        Formula1 dis1 = new Formula1(12, 2, 2, 2);
        Formula2 dis2 = new Formula2(12, 2, 2, 2);
        Formula3 dis3 = new Formula3(12, 2, 2, 2);
        System.out.println("\nPROBLEMA 1\n");
        System.out.println("Distancia Formula 1: " + dis1.CalcularDistancia());
        System.out.println("Distancia Formula 2: " + dis2.CalcularDistancia());
        System.out.println("Distancia Formula 3: " + dis3.CalcularDistancia() );

        System.out.println("\n------------------------------------------");
        
        //PROBLEMA 2
        System.out.println("\nPROBLEMA 2\n");
        Manufactura manufactura = new Manufactura("Juan", "Pérez", 30, 40, 40);
        Apoyo apoyo = new Apoyo("María", "García", 25, 50, 40);
        Jefe jefe = new Jefe("Pedro", "Rodríguez", 45, 5000);

        // Imprimir los salarios de los empleados utilizando el método estático
        imprimirSalario(manufactura);
        imprimirSalario(apoyo);
        imprimirSalario(jefe);//:v

        System.out.println("\n------------------------------------------");

        //PROBLEMA 3
        System.out.println("\nPROBLEMA 3\n");
        //se captura el salario de un trabajador de timpo completo
        EmpleadoTiempoCompleto em1 = new EmpleadoTiempoCompleto(21141,"Junajo",2.0);
        System.out.println("El salario de "+ em1.getNombre() +" "+ em1.getID() + " es de " + em1.calcularSalario());
        
        //se calcula y captura el salario de un trabajador de timpo parcial
        EmpleadoTiempoParcial em2 = new EmpleadoTiempoParcial(23232, "Juanito", 0, 1.0, 4);
        System.out.println("El salario de "+ em2.getNombre() +" "+ em2.getID() + " es de " + em2.calcularSalario());

        //se hace el ajuste y se captura un salario 
        Administrador em3 = new Administrador(22023, "Sancho", 5, 20);
        System.out.println("El salario de "+ em3.getNombre() +" "+ em3.getID() + " es de " + em3.calcularSalario());

        System.out.println("\n------------------------------------------\n");

    }
    
}
