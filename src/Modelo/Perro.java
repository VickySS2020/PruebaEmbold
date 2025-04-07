/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author campv
 */
public class Perro {
    private String nombre;
    private String raza;
    private String padecimiento;
    private double altura;
    private double peso;
    private int numVisitas;

    public Perro(String nombre, String raza, String padecimiento, double altura, double peso, int numVisitas) {
        this.nombre = nombre;
        this.raza = raza;
        this.padecimiento = padecimiento;
        this.altura = altura;
        this.peso = peso;
        this.numVisitas = numVisitas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getPadecimiento() {
        return padecimiento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getNumVisitas() {
        return numVisitas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPadecimiento(String padecimiento) {
        this.padecimiento = padecimiento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNumVisitas(int numVisitas) {
        this.numVisitas = numVisitas;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" Raza: "+raza+" Padecimiento: "+padecimiento+"\nAltura: "+altura+" Peso: "+peso+" Num. de visitas: "+numVisitas;
    }
    
}
