package est.ups.poo.examen.E1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante);

        System.out.print("Ingrese asignatura: ");
        String nombreAsignatura = scanner.nextLine();
        Asignatura asignatura = new Asignatura(nombreAsignatura);

        System.out.print("Ingrese calificación: ");
        double nota = scanner.nextDouble();

        Calificacion calificacion = new Calificacion(asignatura, nota);
        estudiante.agregarCalificacion(calificacion);

        System.out.println(estudiante);

        scanner.close();
    }
}
