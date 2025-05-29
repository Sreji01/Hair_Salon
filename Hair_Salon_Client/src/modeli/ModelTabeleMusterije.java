/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

import domain.Musterija;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sreja
 */
public class ModelTabeleMusterije extends AbstractTableModel {

    private List<Musterija> musterije;
    private String[] kolone = {"Ime", "Prezime", "Email", "Telefon", "Tip musterije"};

    public ModelTabeleMusterije(List<Musterija> musterije) {
        this.musterije = musterije;
    }

    @Override
    public int getRowCount() {
        return musterije.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Musterija musterija = musterije.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return musterija.getIme();
            case 1:
                return musterija.getPrezime();
            case 2:
                return musterija.getEmail();
            case 3:
                return musterija.getTelefon();
            case 4:
                return musterija.getTipMusterije();
            default:
                return "N/A";
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
}
