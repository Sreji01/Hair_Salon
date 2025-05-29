/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.evidencijaTermina;

import domain.EvidencijaTermina;
import domain.OpstiDomenskiObjekat;
import domain.StavkaTermina;
import java.util.ArrayList;
import java.util.List;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;

/**
 *
 * @author Sreja
 */
public class PromeniEvidencijaTermina extends ApstraktnaSO {

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        EvidencijaTermina evidencijaTermina = (EvidencijaTermina) odo;
        DatabaseBroker.getInstance().update(evidencijaTermina);
        StavkaTermina st = new StavkaTermina();
        st.setEvidencijaTermina(evidencijaTermina);
        DatabaseBroker.getInstance().delete(st);
        int rb = 1;
        for (StavkaTermina stavkaTermina : evidencijaTermina.getStavkeTermina()) {
            stavkaTermina.setEvidencijaTermina(evidencijaTermina);
            stavkaTermina.setRedniBroj(rb);
            DatabaseBroker.getInstance().insert(stavkaTermina);
            rb++;
        }
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
        EvidencijaTermina evidencijaTermina = (EvidencijaTermina) odo;
        List<EvidencijaTermina> evidencijeTermina = (List<EvidencijaTermina>) (ArrayList<?>) DatabaseBroker.getInstance().select(new EvidencijaTermina());
        for (EvidencijaTermina et : evidencijeTermina) {
            if (evidencijaTermina.getIdEvidencijaTermina() != et.getIdEvidencijaTermina()) {
                if (evidencijaTermina.getFrizer().equals(et.getFrizer()) && evidencijaTermina.getDatumIVremePocetka().after(et.getDatumIVremePocetka())
                        && evidencijaTermina.getDatumIVremePocetka().before(et.getDatumIVremeKraja())) {
                    throw new Exception();
                }
                if ((evidencijaTermina.getFrizer().equals(et.getFrizer()) || evidencijaTermina.getMusterija().equals(et.getMusterija())) && evidencijaTermina.getDatumIVremePocetka().after(et.getDatumIVremePocetka())
                        && evidencijaTermina.getDatumIVremePocetka().before(et.getDatumIVremeKraja())) {
                    throw new Exception();
                }
                if ((evidencijaTermina.getFrizer().equals(et.getFrizer()) || evidencijaTermina.getMusterija().equals(et.getMusterija())) && evidencijaTermina.getDatumIVremeKraja().after(et.getDatumIVremePocetka())
                        && evidencijaTermina.getDatumIVremeKraja().before(et.getDatumIVremeKraja())) {
                    throw new Exception();
                }
            }
        }
        if (!Character.isUpperCase(evidencijaTermina.getOpis().charAt(0))) {
            throw new Exception();
        }
        if (evidencijaTermina.getOpis().length() > 100) {
            throw new Exception();
        }
    }

}
