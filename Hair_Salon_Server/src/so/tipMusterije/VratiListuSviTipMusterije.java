/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.tipMusterije;

import domain.OpstiDomenskiObjekat;
import domain.TipMusterije;
import java.util.ArrayList;
import java.util.List;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;

/**
 *
 * @author Sreja
 */
public class VratiListuSviTipMusterije extends ApstraktnaSO{
    private List<TipMusterije> tipoviMusterija;
    
    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        tipoviMusterija = (List<TipMusterije>) (ArrayList<?>)DatabaseBroker.getInstance().select((TipMusterije) odo);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }
    
    public List<TipMusterije> vratiTipoveMusterija(){
        return tipoviMusterija;
    }
    
}
