/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.musterija;

import domain.Musterija;
import domain.OpstiDomenskiObjekat;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;

/**
 *
 * @author Sreja
 */
public class PretraziMusterija extends ApstraktnaSO {
    private Musterija musterija;

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        musterija = (Musterija) DatabaseBroker.getInstance().selectOne((Musterija) odo);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }

    public Musterija vratiMusteriju(){
        return musterija;
    }
}
