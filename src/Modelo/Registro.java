/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author campv
 */
public class Registro {
    private Dueno cliente;
    private Veterinario veterinario;
    private ArrayList<Perro> mascotas;
    private Cita cita;

    public Registro(Dueno cliente, Veterinario veterinario, ArrayList<Perro> mascotas, Cita cita) {
        this.cliente = cliente;
        this.veterinario = veterinario;
        this.mascotas = mascotas;
        this.cita = cita;
    }

    public Dueno getCliente() {
        return cliente;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public ArrayList<Perro> getMascotas() {
        return mascotas;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCliente(Dueno cliente) {
        this.cliente = cliente;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public void setMascotas(ArrayList<Perro> mascotas) {
        this.mascotas = mascotas;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    @Override
    public String toString() {
        //return cliente + "\n" + veterinario + "\n" + mascotas + "\n" + cita;
        return cliente + "\n" + veterinario + "\n" + cita;
    }
    
    
}
