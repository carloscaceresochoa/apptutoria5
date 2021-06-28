package com.udc.tutoria5.modelo;

import java.io.Serializable;

public class Persona implements Serializable {

     private String nombre;
     private int edad;
     private double est;
     private boolean acept;
     private char genero;

    public Persona(String nombre, int edad, double est,
                   boolean acept, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.est = est;
        this.acept = acept;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEst() {
        return est;
    }

    public void setEst(double est) {
        this.est = est;
    }

    public boolean isAcept() {
        return acept;
    }

    public void setAcept(boolean acept) {
        this.acept = acept;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String mostrar(){
        return nombre+" "+edad+" "+est+" "+acept+" "+genero;
    }

}
