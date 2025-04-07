/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author campv
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        setMes(mes);
        setAnio(anio);
        setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setDia(int dia) {
        int diasPorMes[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(mes==2 && dia==29 && ((anio%4==0 && anio%100!=0) || anio%400==0)){
            this.dia = dia;
        }
        else{
            if(dia>=1 && dia<=diasPorMes[mes]){
                this.dia=dia;
            }
            else{
                this.dia=1;
            }
        }
    }

    public void setMes(int mes) {
        if(mes>=1 && mes<=12){
            this.mes = mes;
        }
        else{
            this.mes=1;
        }
    }

    public void setAnio(int anio) {
        if(anio>=1990 && anio<=2023){
            this.anio = anio;
        }
        else{
            this.anio= 2023;
        }
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio ;
    }
    
    
}
