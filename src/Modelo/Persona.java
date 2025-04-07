/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author campv
 */
public abstract class Persona {
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String telefono;

    public Persona(String nombre, String apellidoP, String apellidoM, String telefono) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //metodo abstracto
    public abstract String tipoPersona();
    
    @Override
    public String toString() {
        return getNombre()+" "+getApellidoP()+" "+getApellidoM()+"  Cel: "+getTelefono();
    }
    
}
