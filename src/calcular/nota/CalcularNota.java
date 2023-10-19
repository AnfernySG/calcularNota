/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcular.nota;

import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class CalcularNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int numEstudiantes = sc.nextInt();

        double sumaNotas = 0;
        int estudiantesAprobados = 0;
        double notaMasAlta = -1;

        for (int i = 1; i <= numEstudiantes; i++) {
            System.out.print("Nota del estudiante " + i + ": ");
            double nota = sc.nextDouble();
            sumaNotas += nota;

            
            if (nota >= 70) {
                estudiantesAprobados++;
            }
            notaMasAlta = Math.max(nota, notaMasAlta);
                
        }
        double notaPromedio = sumaNotas / numEstudiantes;

            System.out.println("Promedio: " + notaPromedio);
            System.out.println("Nota más alta: " + notaMasAlta);
            System.out.println("Estudiantes aprobados: " + estudiantesAprobados);

        
    
        
    }
    
}
