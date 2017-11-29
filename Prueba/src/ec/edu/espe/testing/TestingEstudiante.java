/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.testing;

import ec.edu.espe.model.Estudiante;
import ec.edu.espe.model.Promedio;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TestingEstudiante {
    
    public static void main(String[] args) {
   
    Scanner sc=new Scanner(System.in);
    String nombreEs;
    String nombreMat ;
    int cedula;
    float nota1;
    float nota2;
    float nota3;
    
   System.out.println("Ingrese el nombre de estudiantes");
    nombreEs=sc.nextLine();
    System.out.println("Ingrese la cedula del estudiante");
    cedula=sc.nextInt();
    System.out.println("Ingrese el nombre de la mateia1");
    sc.nextLine();
    nombreMat=sc.nextLine();
    System.out.println("Ingrese la nota1");
    nota1=sc.nextFloat();
    System.out.println("Ingrese la nota2");
    nota2=sc.nextFloat();
    System.out.println("Ingrese la nota3");
   nota3=sc.nextFloat();
   
   Promedio promedio= new Promedio(nota1, nota2, nota3);
   
   promedio.promedio(nota1, nota2, nota3);
   
    System.out.println("el prmedio es : " + promedio.getPromedio());
   System.out.println("Ingrese el nombre de la mateia2");
   
    nombreMat=sc.nextLine();
    System.out.println("Ingrese la nota1");
    nota1=sc.nextFloat();
    System.out.println("Ingrese la nota2");
    nota2=sc.nextFloat();
    System.out.println("Ingrese la nota3");
   nota3=sc.nextFloat();
   promedio.promedio(nota1, nota2, nota3);
    System.out.println("el prmedio es : " + promedio.getPromedio());
    
   System.out.println("Ingrese el nombre de la mateia3");
    nombreMat=sc.nextLine();
    System.out.println("Ingrese la nota1");
    nota1=sc.nextFloat();
    System.out.println("Ingrese la nota2");
    nota2=sc.nextFloat();
    System.out.println("Ingrese la nota3");
   nota3=sc.nextFloat();
   promedio.promedio(nota1, nota2, nota3);
    System.out.println("el prmedio es : " + promedio.getPromedio());
   Estudiante estudiante=new Estudiante (nombreEs,cedula);
   
       
        
   
   
    }
    
   
    
    
    
}
