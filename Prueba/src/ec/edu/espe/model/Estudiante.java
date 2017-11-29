/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;



public class Estudiante {
    
    private String Nombre;
    private int Cedula;
    private String materia1;
    private String materia2;
    private String materia3;

    public String getNombre() {
        return Nombre;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public Estudiante(String Nombre, int Cedula) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
    }
    
    
}
