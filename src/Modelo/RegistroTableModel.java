/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danor
 */
public class RegistroTableModel extends AbstractTableModel {
    private ArrayList<Registro> listaRegistros;
    private String[] columnas = {"Cliente", "Veterinario", "Cita"};

    public RegistroTableModel(ArrayList<Registro> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }

    @Override
    public int getRowCount() {
        return listaRegistros.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Registro registro = listaRegistros.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return registro.getCliente().toString();
            case 1:
                return registro.getVeterinario().toString();
            case 2:
                return registro.getCita().toString();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
    
}
