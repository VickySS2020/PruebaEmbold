/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;
import Modelo.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author campv
 */
public class CrearRegistro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcionMenu=0;
        int opcionPerro=0;
        ArrayList<Registro>listaRegistros=new ArrayList<Registro>();
        Scanner entradaInt=new Scanner(System.in);
        Scanner entradaDbl=new Scanner(System.in);
        Scanner entradaStr=new Scanner(System.in);
        
        do{
            System.out.println("------MENU------\n1)Llenar registro\n2)Imprimir registros\n3)Salir\n\nSeleccione: ");
            opcionMenu=entradaInt.nextInt();
            switch(opcionMenu){
                case 1:
                    ArrayList<Perro> listaMascotas=new ArrayList<Perro>();
                    System.out.println("Introduzca el nombre del cliente: \nNombre: ");
                    String nombre=entradaStr.nextLine();
                    System.out.println("\nApellido paterno: ");
                    String apellidoP=entradaStr.nextLine();
                    System.out.println("\nApellido materno: ");
                    String apellidoM=entradaStr.nextLine();
                    System.out.println("Introduzca el numero de telefono: ");
                    String numTelefono=entradaInt.nextLine();
                    System.out.println("Introduzca el domicilio: ");
                    String domicilio=entradaStr.nextLine();
                    
                    Dueno cliente=new Dueno(nombre,apellidoP,apellidoM,numTelefono,domicilio);
                    System.out.println(cliente);
                    
                    System.out.println("Introduzca el nombre del veterinario: \nNombre: ");
                    nombre=entradaStr.nextLine();
                    System.out.println("\nApellido paterno: ");
                    apellidoP=entradaStr.nextLine();
                    System.out.println("\nApellido materno: ");
                    apellidoM=entradaStr.nextLine();
                    System.out.println("Introduzca el numero de telefono: ");
                    numTelefono=entradaInt.nextLine();
                    System.out.println("Introduzca el salario del veterinario: ");
                    double salario=entradaDbl.nextDouble();
                    System.out.println("Introduzca la clave de empleado: ");
                    String claveEmp=entradaStr.nextLine();
                    
                    Veterinario veterinario=new Veterinario(nombre,apellidoP,apellidoM,numTelefono,salario,claveEmp);
                    System.out.println(veterinario);
                    
                    do{
                        System.out.println("Introduzca los datos de la mascota atendida:\nNombre: ");
                        nombre=entradaStr.nextLine();
                        System.out.println("\nRaza: ");
                        String raza=entradaStr.nextLine();
                        System.out.println("\nPadecimiento: ");
                        String padecimiento=entradaStr.nextLine();
                        System.out.println("\nAltura: ");
                        double altura=entradaDbl.nextDouble();
                        System.out.println("\nPeso: ");
                        double peso=entradaDbl.nextDouble();
                        System.out.println("\nNumero de visitas: ");
                        int numVisitas=entradaInt.nextInt();
                        
                        Perro mascota=new Perro(nombre,raza,padecimiento,altura,peso,numVisitas);
                        listaMascotas.add(mascota);
                        System.out.println(mascota);
                        
                        System.out.println("Desea agregar otra mascota:\n1)Si\n2)No\n\nSeleccione: ");
                        opcionPerro=entradaInt.nextInt();
                    }while(opcionPerro!=2);
                    
                    System.out.println("Introduzca la fecha de la cita(dd/mm/aa):\ndia: ");
                    int dia=entradaInt.nextInt();
                    System.out.println("\nmes: ");
                    int mes=entradaInt.nextInt();
                    System.out.println("\nanio: ");
                    int anio=entradaInt.nextInt();
                    
                    Fecha fecha=new Fecha(dia,mes,anio);
                    System.out.println(fecha);
                    
                    System.out.println("Introduzca la hora en que empieza la cita:\nhora: ");
                    int hora=entradaInt.nextInt();
                    System.out.println("\nMinutos: ");
                    int minutos=entradaInt.nextInt();
                    
                    Hora horaInicio=new Hora(hora,minutos);
                    System.out.println(horaInicio);
                    
                    System.out.println("Introduzca la duracion de la cita: ");
                    int duracion=entradaInt.nextInt();
                    System.out.println("Introduzca el costo base de la cita: ");
                    double costoBase=entradaDbl.nextDouble();
                    
                    Cita cita=new Cita(fecha,horaInicio,duracion,costoBase);
                    
                    Registro registro=new Registro(cliente,veterinario,listaMascotas,cita);
                    listaRegistros.add(registro);
                    break;
                case 2:
                    for(int i=0;i<listaRegistros.size();i++){
                        System.out.println(listaRegistros.get(i)+"\nCosto total: "+listaRegistros.get(i).getCita().calcularCostoCita(listaRegistros.get(i).getMascotas().size(), listaRegistros.get(i).getVeterinario().getSaldo()));
                        for(int j=0;j<listaRegistros.get(i).getMascotas().size();j++){
                            System.out.println(listaRegistros.get(i).getMascotas().get(j));
                        }
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("ERROR: numero de opcion invalida");
                    break;
            }
        }while(opcionMenu!=3);
        
        
        
    }
    
}
