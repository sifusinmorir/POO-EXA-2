package DatosIntegrantes;
public class Integrantes {
    private static String[][] integrantes = {
        {"22550721", "Ingenieria en Sistemas Computacionales", "Christian Eduardo", "Flores Ortega"},
        {"22550353", "Ingenieria en Sistemas Computacionales", "Sinue Abelardo", "Mendoza Portillo"},
        {"22550329", "Ingenieria en Sistemas Computacionales", "Diego Arturo", "Quiroz Medina"}
    };
    
    private static String nombreEquipo = "Vanilla Cream Pie";
     
    private static String[] problemasResueltos = {
        "Problemas Resueltos",
        "Problema 1",
        "Problema 2",
        "Problema 3"
    };
    
    public static void imprimirDatosEquipo() {
        System.out.println("Datos del equipo:");
        for (int i = 0; i < integrantes.length; i++) {
            System.out.println("Integrante " + (i+1) + ":");
            System.out.println("Número de control: " + integrantes[i][0]);
            System.out.println("Carrera: " + integrantes[i][1]);
            System.out.println("Nombre: " + integrantes[i][2]);
            System.out.println("Apellidos: " + integrantes[i][3]);
        }
        System.out.println("Nombre del equipo: " + nombreEquipo);
    }
    
    public static void imprimirProblemasResueltos() {
        System.out.println("Problemas resueltos:");
        for (int i = 0; i < problemasResueltos.length; i++) {
            System.out.println("- " + problemasResueltos[i]);
        }
    }
}
