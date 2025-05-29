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
public class Musterija implements OpstiDomenskiObjekat, Serializable {
    private long idMusterija;
    private String ime;
    private String prezime;
    private String email;
    private String telefon;
    private TipMusterije tipMusterije;

    public Musterija() {
    }

    public Musterija(long idMusterija, String ime, String prezime, String email, String telefon, TipMusterije tipMusterije) {
        this.idMusterija = idMusterija;
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
        this.telefon = telefon;
        this.tipMusterije = tipMusterije;
    }

    public long getIdMusterija() {
        return idMusterija;
    }

    public void setIdMusterija(long idMusterija) {
        this.idMusterija = idMusterija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public TipMusterije getTipMusterije() {
        return tipMusterije;
    }

    public void setTipMusterije(TipMusterije tipMusterije) {
        this.tipMusterije = tipMusterije;
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
        final Musterija other = (Musterija) obj;
        if (this.idMusterija != other.idMusterija) {
            return false;
        }
        if (!Objects.equals(this.ime, other.ime)) {
            return false;
        }
        if (!Objects.equals(this.prezime, other.prezime)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefon, other.telefon)) {
            return false;
        }
        return Objects.equals(this.tipMusterije, other.tipMusterije);
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    @Override
    public String getTableName() {
        return "musterija";
    }

    @Override
    public String getColumnsForInsert() {
        return "ime, prezime, email, telefon, idTipMusterije";
    }

    @Override
    public String getParamsForInsert() {
        return "NULL, NULL, NULL, NULL, NULL";
    }

    @Override
    public String setAtrValue() {
        return "ime=" + "'" + ime + "'" + ", " + "prezime=" + "'" + prezime + "'" + ", " + "email=" + "'" + email + "'" + ", "
                + "telefon=" + "'" + telefon + "'" + ", " + "idTipMusterije=" + tipMusterije.getIdTipMusterije();
    }

    @Override
    public String getPrimaryKey() {
        return "idMusterija = " + idMusterija;
    }

    @Override
    public String alijas() {
        return "m";
    }

    @Override
    public String join() {
        return "JOIN tip_musterije tm ON m.idTipMusterije = tm.idTipMusterije";
    }

    @Override
    public String getWhereCondition() {
        String whereString = "";
        boolean prvo = false;
        if(idMusterija != 0){
            return " WHERE idMusterija = " + idMusterija;
        }
        if (ime != null) {
            whereString += " WHERE ime LIKE " + "'%" + ime + "%'";
            prvo = true;
        }
        if (prezime != null) {
            if (prvo) {
                whereString += " AND prezime LIKE " + "'%" + prezime + "%'";
            } else {
                whereString += " WHERE prezime LIKE " + "'%" + prezime + "%'";
                prvo = true;
            }

        }
        if (email != null) {
            if (prvo) {
                whereString += " AND email LIKE " + "'%" + email + "%'";
            } else {
                whereString += " WHERE email LIKE " + "'%" + email + "%'";
                prvo = true;
            }

        }
        if (telefon != null) {
            if (prvo) {
                whereString += " AND telefon LIKE " + "'%" + telefon + "%'";
            } else {
                whereString += " WHERE telefon LIKE " + "'%" + telefon + "%'";
                prvo = true;
            }
        }

        if (tipMusterije != null) {
            if (prvo) {
                whereString += " AND m.idTipMusterije = " + tipMusterije.getIdTipMusterije();
            } else {
                whereString += " WHERE m.idTipMusterije = " + tipMusterije.getIdTipMusterije();
            }
        }
        if(idMusterija == 0 && ime == null && prezime == null && email == null && telefon == null && tipMusterije == null){
            return "";
        }
        return whereString;
    }

    @Override
    public OpstiDomenskiObjekat getNewRecord(ResultSet rs) throws SQLException {
        return new Musterija(rs.getLong("m.idMusterija"), rs.getString("m.ime"), rs.getString("m.prezime"), rs.getString("m.email"), rs.getString("m.telefon"),
                new TipMusterije(rs.getLong("tm.idTipMusterije"), rs.getString("tm.naziv"), rs.getFloat("tm.popust")));
    }

}
