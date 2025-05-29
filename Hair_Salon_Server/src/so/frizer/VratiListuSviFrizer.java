/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.frizer;

import domain.Frizer;
import domain.OpstiDomenskiObjekat;
import java.util.ArrayList;
import java.util.List;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;

/**
 *
 * @author Sreja
 */
public class VratiListuSviFrizer extends ApstraktnaSO {
    private List<Frizer> frizeri;
    
    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        frizeri = (List<Frizer>) (ArrayList<?>)DatabaseBroker.getInstance().select((Frizer) odo);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }
    
    public List<Frizer> vratiFrizere(){
        return frizeri;
    }

}
