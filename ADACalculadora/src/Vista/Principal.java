/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import java.util.ArrayList;

/**
 *
 * @author campv
 */
public class Principal {
    public static ArrayList<StackTraceElement> listaFaltas=new ArrayList<StackTraceElement>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        new Calculadora().setVisible(true);
    }
    
}
