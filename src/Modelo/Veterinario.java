/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author campv
 */
public class Veterinario extends Persona{
    private String claveEmp;
    private double saldo;

    public Veterinario(String nombre, String apellidoP, String apellidoM, String telefono, double saldo, String claveEmp) {
        super(nombre, apellidoP, apellidoM, telefono);
        this.claveEmp = claveEmp;
        setSaldo(saldo);
    }

    public String getClaveEmp() {
        return claveEmp;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setClaveEmp(String claveEmp) {
        this.claveEmp = claveEmp;
    }

    public void setSaldo(double saldo) {
        if(saldo<=0){
            this.saldo = 1;
        }
        else{
            this.saldo = saldo;
        }
    }
    
    public String tipoPersona(){
        return "";
    }

    @Override
    public String toString() {
        return claveEmp + " " + tipoPersona()+"\n"+super.toString()+ "\n  Saldo:" + saldo ;
    }
    
}
