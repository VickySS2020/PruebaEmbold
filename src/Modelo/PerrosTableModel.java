/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Vista.FDMDatosConsulta;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alex Saavedra
 */
public class PerrosTableModel {
    public void inicializarTabla(JTable tabla){
        Vector<String> titulos= new Vector<String>();
        Vector<Vector<Object>> datos= new Vector<Vector<Object>>();
        
        titulos.add("Dueño");
        titulos.add("Nombre");
        titulos.add("Raza");
        titulos.add("Motivo de Consulta");
        titulos.add("Altura");
        titulos.add("Peso");
        titulos.add("No.Visitas");
        
        
        for(int i=0;i<FDMDatosConsulta.listaRegistros.size();i++){
            for(int j=0;j<FDMDatosConsulta.listaRegistros.get(i).getMascotas().size();j++){
                Vector<Object> fila= new Vector<Object>();
                
                // Concatena el nombre y apellido del cliente
                String nombreCompleto = FDMDatosConsulta.listaRegistros.get(i).getCliente().getNombre()
                        + " " + FDMDatosConsulta.listaRegistros.get(i).getCliente().getApellidoP();
                fila.add(nombreCompleto);
                
                 fila.add(FDMDatosConsulta.listaRegistros.get(i).getMascotas().get(j).getNombre());
                fila.add(FDMDatosConsulta.listaRegistros.get(i).getMascotas().get(j).getRaza());
                fila.add(FDMDatosConsulta.listaRegistros.get(i).getMascotas().get(j).getPadecimiento());
                fila.add(""+FDMDatosConsulta.listaRegistros.get(i).getMascotas().get(j).getAltura());
                fila.add(FDMDatosConsulta.listaRegistros.get(i).getMascotas().get(j).getPeso());
                fila.add(FDMDatosConsulta.listaRegistros.get(i).getMascotas().get(j).getNumVisitas());

                datos.add(fila);
            }
        }
        DefaultTableModel modelo= new DefaultTableModel(datos,titulos);
        tabla.setModel(modelo);
    }
}
