/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Sreja
 */
public class EvidencijaTermina implements OpstiDomenskiObjekat, Serializable {

    private long idEvidencijaTermina;
    private Date datumIVremePocetka;
    private Date datumIVremeKraja;
    private String opis;
    private double ukupnoTrajanje;
    private double ukupanIznos;
    private Frizer frizer;
    private Musterija musterija;
    private List<StavkaTermina> stavkeTermina;

    public EvidencijaTermina() {
    }

    public EvidencijaTermina(long idEvidencijaTermina, Date datumIVremePocetka, String opis, Frizer frizer, Musterija musterija, List<StavkaTermina> stavkeTermina) {
        this.idEvidencijaTermina = idEvidencijaTermina;
        this.datumIVremePocetka = datumIVremePocetka;
        this.opis = opis;
        this.frizer = frizer;
        this.musterija = musterija;
        this.stavkeTermina = stavkeTermina;
        this.ukupanIznos = 0;
        this.ukupnoTrajanje = 0;
        for (StavkaTermina stavkaTermina : stavkeTermina) {
            this.ukupanIznos += stavkaTermina.getIznosUsluge();
            this.ukupnoTrajanje += stavkaTermina.getUsluga().getTrajanje();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.datumIVremePocetka);
        calendar.add(Calendar.MINUTE, (int) ukupnoTrajanje);
        this.datumIVremeKraja = calendar.getTime();
    }

    public EvidencijaTermina(long idEvidencijaTermina, Date datumIVremePocetka, Date datumIVremeKraja, String opis, double ukupnoTrajanje, double ukupanIznos, Frizer frizer, Musterija musterija, List<StavkaTermina> stavkeTermina) {
        this.idEvidencijaTermina = idEvidencijaTermina;
        this.datumIVremePocetka = datumIVremePocetka;
        this.datumIVremeKraja = datumIVremeKraja;
        this.opis = opis;
        this.ukupnoTrajanje = ukupnoTrajanje;
        this.ukupanIznos = ukupanIznos;
        this.frizer = frizer;
        this.musterija = musterija;
        this.stavkeTermina = stavkeTermina;
    }

    public long getIdEvidencijaTermina() {
        return idEvidencijaTermina;
    }

    public void setIdEvidencijaTermina(long idEvidencijaTermina) {
        this.idEvidencijaTermina = idEvidencijaTermina;
    }

    public Date getDatumIVremePocetka() {
        return datumIVremePocetka;
    }

    public void setDatumIVremePocetka(Date datumIVremePocetka) {
        this.datumIVremePocetka = datumIVremePocetka;
    }

    public Date getDatumIVremeKraja() {
        return datumIVremeKraja;
    }

    public void setDatumIVremeKraja(Date datumIVremeKraja) {
        this.datumIVremeKraja = datumIVremeKraja;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public double getUkupnoTrajanje() {
        return ukupnoTrajanje;
    }

    public void setUkupnoTrajanje(double ukupnoTrajanje) {
        this.ukupnoTrajanje = ukupnoTrajanje;
    }

    public double getUkupanIznos() {
        return ukupanIznos;
    }

    public void setUkupanIznos(double ukupanIznos) {
        this.ukupanIznos = ukupanIznos;
    }

    public Frizer getFrizer() {
        return frizer;
    }

    public void setFrizer(Frizer frizer) {
        this.frizer = frizer;
    }

    public Musterija getMusterija() {
        return musterija;
    }

    public void setMusterija(Musterija musterija) {
        this.musterija = musterija;
    }

    public List<StavkaTermina> getStavkeTermina() {
        return stavkeTermina;
    }

    public void setStavkeTermina(List<StavkaTermina> stavkeTermina) {
        this.stavkeTermina = stavkeTermina;
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
        final EvidencijaTermina other = (EvidencijaTermina) obj;
        if (this.idEvidencijaTermina != other.idEvidencijaTermina) {
            return false;
        }
        if (Double.doubleToLongBits(this.ukupnoTrajanje) != Double.doubleToLongBits(other.ukupnoTrajanje)) {
            return false;
        }
        if (Double.doubleToLongBits(this.ukupanIznos) != Double.doubleToLongBits(other.ukupanIznos)) {
            return false;
        }
        if (!Objects.equals(this.opis, other.opis)) {
            return false;
        }
        if (!Objects.equals(this.datumIVremePocetka, other.datumIVremePocetka)) {
            return false;
        }
        if (!Objects.equals(this.datumIVremeKraja, other.datumIVremeKraja)) {
            return false;
        }
        if (!Objects.equals(this.frizer, other.frizer)) {
            return false;
        }
        if (!Objects.equals(this.musterija, other.musterija)) {
            return false;
        }
        return Objects.equals(this.stavkeTermina, other.stavkeTermina);
    }

    @Override
    public String toString() {
        return "EvidencijaTermina{" + "idEvidencijaTermina=" + idEvidencijaTermina + ", datumIVremePocetka=" + datumIVremePocetka + ", datumIVremeKraja=" + datumIVremeKraja + ", opis=" + opis + ", ukupnoTrajanje=" + ukupnoTrajanje + ", ukupanIznos=" + ukupanIznos + ", frizer=" + frizer + ", musterija=" + musterija + ", stavkeTermina=" + stavkeTermina + '}';
    }

    @Override
    public String getTableName() {
        return "evidencija_termina";
    }

    @Override
    public String getColumnsForInsert() {
        return "datumVremePocetka, datumVremeKraja, opis, ukupanIznos, ukupnoTrajanje, idFrizer, idMusterija";
    }

    @Override
    public String getParamsForInsert() {
        return "NULL, NULL, NULL, NULL, NULL, NULL, NULL";
    }

    @Override
    public String setAtrValue() {
        return "datumVremePocetka=" + "'" + getSQLDatumVreme(datumIVremePocetka) + "'" + ", "
                + "datumVremeKraja=" + "'" + getSQLDatumVreme(datumIVremeKraja) + "'" + ", " + "opis=" + "'" + opis + "'" + ", " + "ukupanIznos=" + ukupanIznos + ", "
                + "ukupnoTrajanje=" + ukupnoTrajanje + ", " + "idFrizer=" + frizer.getIdFrizer() + ", " + "idMusterija=" + musterija.getIdMusterija();
    }

    @Override
    public String getPrimaryKey() {
        return "idEvidencijaTermina = " + idEvidencijaTermina;
    }

    @Override
    public String alijas() {
        return "et";
    }

    @Override
    public String join() {
        return "JOIN frizer f ON et.idFrizer = f.idFrizer JOIN musterija m ON et.idMusterija = m.idMusterija \n"
                + "JOIN tip_musterije tm ON m.idTipMusterije = tm.idTipMusterije";
    }

    @Override
    public String getWhereCondition() {
        String whereString = "";
        boolean prvo = false;
        if (idEvidencijaTermina != 0) {
            return " WHERE et.idEvidencijaTermina = " + idEvidencijaTermina;
        }
        if (datumIVremePocetka != null) {
            whereString += " WHERE et.datumVremePocetka LIKE " + "'%" + getSQLDatum(datumIVremePocetka) + "%'";
            prvo = true;
        }
        if (opis != null) {
            if (prvo) {
                whereString += " AND et.opis LIKE " + "'%" + opis + "%'";
            } else {
                whereString += " WHERE et.opis LIKE " + "'%" + opis + "%'";
                prvo = true;
            }

        }
        if (ukupanIznos != 0) {
            if (prvo) {
                whereString += " AND et.ukupanIznos >" + ukupanIznos;
            } else {
                whereString += " WHERE et.ukupanIznos >" + ukupanIznos;
                prvo = true;
            }

        }
        if (ukupnoTrajanje != 0) {
            if (prvo) {
                whereString += " AND et.ukupnoTrajanje >" + ukupnoTrajanje;
            } else {
                whereString += " WHERE et.ukupnoTrajanje >" + ukupnoTrajanje;
                prvo = true;
            }

        }

        if (frizer != null) {
            if (prvo) {
                whereString += " AND f.idFrizer = " + frizer.getIdFrizer();
            } else {
                whereString += " WHERE f.idFrizer = " + frizer.getIdFrizer();
            }
        }
        if (musterija != null) {
            if (prvo) {
                whereString += " AND m.idMusterija = " + musterija.getIdMusterija();
            } else {
                whereString += " WHERE m.idMusterija = " + musterija.getIdMusterija();
            }
        }
        if (idEvidencijaTermina == 0 && datumIVremePocetka == null && opis == null && ukupanIznos == 0 && ukupnoTrajanje == 0 && frizer == null && musterija == null) {
            return "";
        }
        return whereString;
    }

    @Override
    public OpstiDomenskiObjekat getNewRecord(ResultSet rs) throws SQLException {
        return new EvidencijaTermina(rs.getLong("et.idEvidencijaTermina"), getUTILDatumVreme(rs.getTimestamp("et.datumVremePocetka")), 
                getUTILDatumVreme(rs.getTimestamp("et.datumVremeKraja")), rs.getString("et.opis"), 
                rs.getFloat("et.ukupnoTrajanje"), rs.getFloat("et.ukupanIznos"), new Frizer(rs.getLong("f.idFrizer"), rs.getString("f.ime"), rs.getString("f.prezime"),
                        rs.getString("f.username"), rs.getString("f.password")), new Musterija(rs.getLong("m.idMusterija"), rs.getString("m.ime"), rs.getString("m.prezime"),
                                rs.getString("m.email"), rs.getString("m.telefon"), new TipMusterije(rs.getLong("tm.idTipMusterije"), rs.getString("tm.naziv"),
                                        rs.getFloat("tm.popust"))), null);
    }

    private java.sql.Timestamp getSQLDatumVreme(Date datumUTIL) {
        return new java.sql.Timestamp(datumUTIL.getTime());
    }
    
    private java.util.Date getUTILDatumVreme(java.sql.Timestamp datumSQL) {
        return new java.util.Date(datumSQL.getTime());
    }

    private java.sql.Date getSQLDatum(Date datumRodjenja) {
        java.sql.Date datumRodjenjaSQL = new java.sql.Date(datumRodjenja.getTime());
        return datumRodjenjaSQL;
    }
}
