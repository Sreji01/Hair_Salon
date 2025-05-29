/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;



/**
 *
 * @author Sreja
 */
public class FrizerskiSalon implements OpstiDomenskiObjekat, Serializable{
    private long idFrizerskiSalon;
    private String naziv;
    private String adresa;

    public FrizerskiSalon() {
    }

    public FrizerskiSalon(long idFrizerskiSalon, String naziv, String adresa) {
        this.idFrizerskiSalon = idFrizerskiSalon;
        this.naziv = naziv;
        this.adresa = adresa;
    }

    public long getIdFrizerskiSalon() {
        return idFrizerskiSalon;
    }

    public void setIdFrizerskiSalon(int idFrizerskiSalon) {
        this.idFrizerskiSalon = idFrizerskiSalon;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FrizerskiSalon other = (FrizerskiSalon) obj;
        if (this.idFrizerskiSalon != other.idFrizerskiSalon) {
            return false;
        }
        if (!Objects.equals(this.naziv, other.naziv)) {
            return false;
        }
        return Objects.equals(this.adresa, other.adresa);
    }

    @Override
    public String toString() {
        return "FrizerskiSalon{" + "idFrizerskiSalon=" + idFrizerskiSalon + ", naziv=" + naziv + ", adresa=" + adresa + '}';
    }

    @Override
    public String getTableName() {
        return "frizerski_salon";
    }

    @Override
    public String getColumnsForInsert() {
        return "naziv, adresa";
    }

    @Override
    public String getParamsForInsert() {
        return "'" + naziv + "', " + "'" + adresa + "'";
    }

    @Override
    public String setAtrValue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getPrimaryKey() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String alijas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String join() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getWhereCondition() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public OpstiDomenskiObjekat getNewRecord(ResultSet rs) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
