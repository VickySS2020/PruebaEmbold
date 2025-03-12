/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

//import static Vista.Calculadora.listaDeErrores;
import Vista.Principal;
//import static Vista.Principal.listaFaltas;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author campv
 */
public class TablaErrores {
    public void InicializarTabla(JTable tabla){
        Vector<String> titulos=new Vector<String>();
        Vector<Vector<Object>> datos=new Vector<Vector<Object>>();
        
        titulos.add("Clase");
        titulos.add("Archivo");
        titulos.add("Método");
        titulos.add("Línea");
        
        for(int i=0;i<Principal.listaFaltas.size();i++){
            Vector<Object> fila=new Vector<Object>();
            fila.add(Principal.listaFaltas.get(i).getClassName());
            fila.add(Principal.listaFaltas.get(i).getFileName());
            fila.add(Principal.listaFaltas.get(i).getMethodName());
            fila.add(Principal.listaFaltas.get(i).getLineNumber());
            
            datos.add(fila);
        }
        DefaultTableModel modelo=new DefaultTableModel(datos,titulos);
        tabla.setModel(modelo);
    }
}
