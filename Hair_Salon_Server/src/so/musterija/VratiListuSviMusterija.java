/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.musterija;
import domain.Musterija;
import domain.OpstiDomenskiObjekat;
import java.util.ArrayList;
import java.util.List;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;
/**
 *
 * @author Sreja
 */
public class VratiListuSviMusterija extends ApstraktnaSO {
    private List<Musterija> musterije;
    
    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        musterije = (List<Musterija>) (ArrayList<?>)DatabaseBroker.getInstance().select((Musterija) odo);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }
    
    public List<Musterija> vratiMusterije(){
        return musterije;
    }
    
}
