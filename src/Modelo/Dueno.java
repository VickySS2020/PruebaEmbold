/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author campv
 */
public class Dueno extends Persona{
    private String domicilio;

    public Dueno(String nombre, String apellidoP, String apellidoM, String telefono, String domicilio) {
        super(nombre, apellidoP, apellidoM, telefono);
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
    
    public String tipoPersona(){
        return "";
    }

    @Override
    public String toString() {
        return tipoPersona()+"\n"+super.toString()+ "  Dir: " + domicilio ;
    }
    
    
}
