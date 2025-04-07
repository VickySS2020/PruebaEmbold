/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author campv
 */
public class Cita {
    private Fecha fecha;
    private Hora hora;
    private int duracion;
    private double costoBase;

    public Cita(Fecha fecha, Hora hora, int duracion, double costoBase) {
        this.fecha = fecha;
        this.hora = hora;
        this.duracion = duracion;
        this.costoBase = costoBase;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public Hora getHora() {
        return hora;
    }

    public int getDuracion() {
        return duracion;
    }

    public double getCostoBase() {
        return costoBase;
    }
    
    
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
    
    //poner metodo de precio de consulta
    public double calcularCostoCita(int numMascotas,double saldo){
        return getCostoBase()+numMascotas*(saldo*getDuracion());
    }

    @Override
    public String toString() {
        return "Fecha: "+getFecha()+" Hora: "+getHora()+" Costo base: "+getCostoBase();
    }
    
    
}
