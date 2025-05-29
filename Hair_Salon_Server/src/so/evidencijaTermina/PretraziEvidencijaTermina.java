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
public class PretraziEvidencijaTermina extends ApstraktnaSO {
    private EvidencijaTermina evidencijaTermina;

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        evidencijaTermina = (EvidencijaTermina) DatabaseBroker.getInstance().selectOne((EvidencijaTermina) odo);
        StavkaTermina stavkaTermina = new StavkaTermina();
        stavkaTermina.setEvidencijaTermina(evidencijaTermina);
        List<StavkaTermina> stavkeTermina = (List<StavkaTermina>) (ArrayList<?>) DatabaseBroker.getInstance().select(stavkaTermina);
        evidencijaTermina.setStavkeTermina(stavkeTermina);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }
    
    public EvidencijaTermina vratiEvidencijuTermina(){
        return evidencijaTermina;
    }
}
