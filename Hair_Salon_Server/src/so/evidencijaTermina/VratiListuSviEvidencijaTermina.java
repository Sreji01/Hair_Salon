/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.evidencijaTermina;

import domain.EvidencijaTermina;
import domain.OpstiDomenskiObjekat;
import java.util.ArrayList;
import java.util.List;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;

/**
 *
 * @author Sreja
 */
public class VratiListuSviEvidencijaTermina extends ApstraktnaSO {
    private List<EvidencijaTermina> evidencijeTermina;

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        evidencijeTermina = (List<EvidencijaTermina>) (ArrayList<?>) DatabaseBroker.getInstance().select((EvidencijaTermina) odo);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }
    
    public List<EvidencijaTermina> vratiEvidencijeTermina(){
        return evidencijeTermina;
    }
}
