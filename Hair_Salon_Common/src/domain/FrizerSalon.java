/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Sreja
 */
public class FrizerSalon implements OpstiDomenskiObjekat, Serializable{
    private Frizer frizer;
    private FrizerSalon FrizerskiSalon;
    private double mesecnaPrimanja;
    private Date datumOd;
    private Date datumDo;

    public FrizerSalon() {
    }

    public FrizerSalon(Frizer frizer, FrizerSalon FrizerskiSalon, double mesecnaPrimanja, Date datumOd, Date datumDo) {
        this.frizer = frizer;
        this.FrizerskiSalon = FrizerskiSalon;
        this.mesecnaPrimanja = mesecnaPrimanja;
        this.datumOd = datumOd;
        this.datumDo = datumDo;
    }

    public Frizer getFrizer() {
        return frizer;
    }

    public void setFrizer(Frizer frizer) {
        this.frizer = frizer;
    }

    public FrizerSalon getFrizerskiSalon() {
        return FrizerskiSalon;
    }

    public void setFrizerskiSalon(FrizerSalon FrizerskiSalon) {
        this.FrizerskiSalon = FrizerskiSalon;
    }

    public double getMesecnaPrimanja() {
        return mesecnaPrimanja;
    }

    public void setMesecnaPrimanja(double mesecnaPrimanja) {
        this.mesecnaPrimanja = mesecnaPrimanja;
    }

    public Date getDatumOd() {
        return datumOd;
    }

    public void setDatumOd(Date datumOd) {
        this.datumOd = datumOd;
    }

    public Date getDatumDo() {
        return datumDo;
    }

    public void setDatumDo(Date datumDo) {
        this.datumDo = datumDo;
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
        final FrizerSalon other = (FrizerSalon) obj;
        if (Double.doubleToLongBits(this.mesecnaPrimanja) != Double.doubleToLongBits(other.mesecnaPrimanja)) {
            return false;
        }
        if (!Objects.equals(this.frizer, other.frizer)) {
            return false;
        }
        if (!Objects.equals(this.FrizerskiSalon, other.FrizerskiSalon)) {
            return false;
        }
        if (!Objects.equals(this.datumOd, other.datumOd)) {
            return false;
        }
        return Objects.equals(this.datumDo, other.datumDo);
    }

    @Override
    public String toString() {
        return "FrizerSalon{" + "frizer=" + frizer + ", FrizerskiSalon=" + FrizerskiSalon + ", mesecnaPrimanja=" + mesecnaPrimanja + ", datumOd=" + datumOd + ", datumDo=" + datumDo + '}';
    }
    
    @Override
    public String getTableName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getColumnsForInsert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getParamsForInsert() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
