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
public class StavkaTermina implements OpstiDomenskiObjekat, Serializable {
    
    private EvidencijaTermina evidencijaTermina;
    private int redniBroj;
    private String napomena;
    private Usluga usluga;
    private double iznosUsluge;
    
    public StavkaTermina() {
    }
    
    public StavkaTermina(EvidencijaTermina evidencijaTermina, int redniBroj, String napomena, Usluga usluga) {
        this.evidencijaTermina = evidencijaTermina;
        this.redniBroj = redniBroj;
        this.napomena = napomena;
        this.usluga = usluga;
        this.iznosUsluge = usluga.getCena();
    }
    
    public EvidencijaTermina getEvidencijaTermina() {
        return evidencijaTermina;
    }
    
    public void setEvidencijaTermina(EvidencijaTermina evidencijaTermina) {
        this.evidencijaTermina = evidencijaTermina;
    }
    
    public int getRedniBroj() {
        return redniBroj;
    }
    
    public void setRedniBroj(int redniBroj) {
        this.redniBroj = redniBroj;
    }
    
    public String getNapomena() {
        return napomena;
    }
    
    public void setNapomena(String napomena) {
        this.napomena = napomena;
    }
    
    public Usluga getUsluga() {
        return usluga;
    }
    
    public void setUsluga(Usluga usluga) {
        this.usluga = usluga;
    }
    
    public double getIznosUsluge() {
        return iznosUsluge;
    }
    
    public void setIznosUsluge(double iznosUsluge) {
        this.iznosUsluge = iznosUsluge;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
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
        final StavkaTermina other = (StavkaTermina) obj;
        if (this.redniBroj != other.redniBroj) {
            return false;
        }
        if (Double.doubleToLongBits(this.iznosUsluge) != Double.doubleToLongBits(other.iznosUsluge)) {
            return false;
        }
        if (!Objects.equals(this.napomena, other.napomena)) {
            return false;
        }
        if (!Objects.equals(this.evidencijaTermina, other.evidencijaTermina)) {
            return false;
        }
        return Objects.equals(this.usluga, other.usluga);
    }
    
    @Override
    public String toString() {
        return "StavkaTermina{" + "evidencijaTermina=" + evidencijaTermina + ", redniBroj=" + redniBroj + ", napomena=" + napomena + ", usluga=" + usluga + ", iznosUsluge=" + iznosUsluge + '}';
    }
    
    @Override
    public String getTableName() {
        return "stavka_termina";
    }
    
    @Override
    public String getColumnsForInsert() {
        return "idEvidencijaTermina, redniBroj, napomena, iznosUsluge, idUsluga";
    }
    
    @Override
    public String getParamsForInsert() {
        return evidencijaTermina.getIdEvidencijaTermina() + ", " + redniBroj + ", " + "'" + napomena + "'" + ", " + iznosUsluge + ", " + usluga.getIdUsluga();
    }
    
    @Override
    public String setAtrValue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String getPrimaryKey() {
        return "idEvidencijaTermina = " + evidencijaTermina.getIdEvidencijaTermina();
    }
    
    @Override
    public String alijas() {
        return "st";
    }
    
    @Override
    public String join() {
        return "JOIN evidencija_termina et ON st.idEvidencijaTermina = et.idEvidencijaTermina\n"
                + "JOIN frizer f ON et.idFrizer = f.idFrizer JOIN musterija m ON et.idMusterija = m.idMusterija \n"
                + "JOIN tip_musterije tm ON m.idTipMusterije = tm.idTipMusterije \n"
                + "JOIN usluga u ON st.idUsluga = u.idUsluga";
    }
    
    @Override
    public String getWhereCondition() {
        return " WHERE st.idEvidencijaTermina = " + evidencijaTermina.getIdEvidencijaTermina();
    }
    
    @Override
    public OpstiDomenskiObjekat getNewRecord(ResultSet rs) throws SQLException {
        return new StavkaTermina(new EvidencijaTermina(rs.getLong("et.idEvidencijaTermina"), getUTILDatumVreme(rs.getTimestamp("et.datumVremePocetka")),
                getUTILDatumVreme(rs.getTimestamp("et.datumVremeKraja")), rs.getString("et.opis"),
                rs.getFloat("et.ukupnoTrajanje"), rs.getFloat("et.ukupanIznos"), new Frizer(rs.getLong("f.idFrizer"), rs.getString("f.ime"), rs.getString("f.prezime"),
                rs.getString("f.username"), rs.getString("f.password")), new Musterija(rs.getLong("m.idMusterija"), rs.getString("m.ime"), rs.getString("m.prezime"),
                rs.getString("m.email"), rs.getString("m.telefon"), new TipMusterije(rs.getLong("tm.idTipMusterije"), rs.getString("tm.naziv"),
                rs.getFloat("tm.popust"))), null), rs.getInt("st.redniBroj"), rs.getString("st.napomena"), new Usluga(rs.getLong("u.idUsluga"), 
                        rs.getString("u.naziv"), rs.getString("u.opis"), rs.getFloat("u.cena"), rs.getFloat("u.trajanje")));
    }
    
    private java.util.Date getUTILDatumVreme(java.sql.Timestamp datumSQL) {
        return new java.util.Date(datumSQL.getTime());
    }
    
}
