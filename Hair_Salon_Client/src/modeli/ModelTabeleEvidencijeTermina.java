/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

import domain.EvidencijaTermina;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sreja
 */
public class ModelTabeleEvidencijeTermina extends AbstractTableModel {

    private List<EvidencijaTermina> evidencijeTermina;
    private String[] kolone = {"Vreme pocetka", "Vreme kraja", "Iznos", "Trajanje", "Frizer", "Musterija"};

    public ModelTabeleEvidencijeTermina(List<EvidencijaTermina> evidencijeTermina) {
        this.evidencijeTermina = evidencijeTermina;
    }

    @Override
    public int getRowCount() {
        return evidencijeTermina.size();
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EvidencijaTermina evidencijaTermina = evidencijeTermina.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return getDatumString(evidencijaTermina.getDatumIVremePocetka());
            case 1:
                return getDatumString(evidencijaTermina.getDatumIVremeKraja());
            case 2:
                return evidencijaTermina.getUkupanIznos();
            case 3:
                return Math.round(evidencijaTermina.getUkupnoTrajanje()) + " min";
            case 4:
                return evidencijaTermina.getFrizer();
            case 5:
                return evidencijaTermina.getMusterija();
            default:
                return "N/A";
        }
    }

    private String getDatumString(Date datum) {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        return format.format(datum);
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }
}
