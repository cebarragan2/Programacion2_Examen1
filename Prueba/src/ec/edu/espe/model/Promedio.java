/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author usuario
 */
public class Promedio {
    
    float nota1;
    float nota2;
    float nota3;
    float promedio;
    
    public float getNota1() {
        return nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public float getNota3() {
        return nota3;
    }
    
    public float getPromedio() {
        return promedio;
    }
    
   

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public Promedio(float nota1, float nota2, float nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    
    public float promedio (float nota1, float nota2, float nota3)
    {
        promedio=(nota1+nota2+nota3)/3;
        return promedio;
    }
    
    public int validar ( float promedio)
    {
        int validar=0;
        
        if (promedio>=14)
        {
            validar=1;
        }
         if (promedio <14 && promedio>=12)
                 {
                     validar =2;
                 }
         if (promedio <12)
         {
             validar=3;
         }
        
        
        return validar; 
    }
    
    
    
    
    
}
