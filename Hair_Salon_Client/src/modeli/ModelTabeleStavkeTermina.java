/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeli;

import domain.StavkaTermina;
import domain.Usluga;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import ui.form.evidencijaTermina.EvidencijaTerminaForma;

/**
 *
 * @author Marko
 */
public class ModelTabeleStavkeTermina extends AbstractTableModel {

    private List<StavkaTermina> stavkeTermina = new ArrayList<>();
    private String[] kolone = {"Redni broj", "Napomena", "Usluga", "Iznos usluge"};
    private EvidencijaTerminaForma etf;

    public ModelTabeleStavkeTermina(List<StavkaTermina> stavkeTermina) {
        this.stavkeTermina = stavkeTermina;
    }

    public List<StavkaTermina> getStavkeTermina() {
        return stavkeTermina;
    }

    public void setStavkeTermina(List<StavkaTermina> stavkeTermina) {
        this.stavkeTermina = stavkeTermina;
    }

    public EvidencijaTerminaForma getEtf() {
        return etf;
    }

    public void setEtf(EvidencijaTerminaForma etf) {
        this.etf = etf;
    }

    @Override
    public int getRowCount() {
        if (stavkeTermina != null) {
            return stavkeTermina.size();
        }
        return 0;
    }

    @Override
    public int getColumnCount() {
        return kolone.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (stavkeTermina != null) {
            StavkaTermina stavkaTermina = stavkeTermina.get(rowIndex);
            switch (columnIndex) {
                case 0:
                        return rowIndex + 1;
                case 1:
                    return stavkaTermina.getNapomena();
                case 2:
                    return stavkaTermina.getUsluga();
                case 3:
                    if (stavkaTermina.getUsluga() != null) {
                        return stavkaTermina.getUsluga().getCena();
                    }
                    return null;
                default:
                    return "N/A";
            }
        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (stavkeTermina != null) {
            StavkaTermina stavkaTermina = stavkeTermina.get(rowIndex);
            if (stavkaTermina != null) {
                switch (columnIndex) {
                    case 1:
                        stavkaTermina.setNapomena((String) aValue);
                        break;
                    case 2:
                        Usluga novaUsluga = (Usluga) aValue;
                        stavkaTermina.setUsluga(novaUsluga);
                        if (novaUsluga != null) {
                            stavkaTermina.setIznosUsluge(novaUsluga.getCena());
                        }
                        fireTableDataChanged();
                        break;
                    default:
                        break;
                }
            }
            etf.promeniUkupanIznos(stavkeTermina);
        }
    }

    @Override
    public String getColumnName(int column) {
        return kolone[column];
    }

    public void dodajStavku(StavkaTermina stavkaTermina) {
        stavkeTermina.add(stavkaTermina);
        fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return false;
            default:
                return false;
        }
    }

    public void obrisiStavku(int selektovaniRed) {
        stavkeTermina.remove(selektovaniRed);
        fireTableDataChanged();
    }

}
