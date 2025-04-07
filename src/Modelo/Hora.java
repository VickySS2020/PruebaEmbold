/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author campv
 */
public class Hora {
    private int hora;
    private int minutos;

    public Hora(int hora, int minutos) {
        setHora(hora);
        setMinutos(minutos);
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setHora(int hora) {
        if(hora>=0 && hora<=23){
            this.hora = hora;
        }
        else{
            this.hora = 0;
        }
    }

    public void setMinutos(int minutos) {
        if(minutos>=0 && minutos<=59){
            this.minutos = minutos;
        }
        else{
            this.minutos = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d",hora,minutos);
    }
    
}
