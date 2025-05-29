/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.usluga;
import domain.Frizer;
import domain.OpstiDomenskiObjekat;
import domain.Usluga;
import java.util.ArrayList;
import java.util.List;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;
import so.ApstraktnaSO;
/**
 *
 * @author Sreja
 */
public class VratiListuSviUsluga extends ApstraktnaSO {
    private List<Usluga> usluge;

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        usluge = (List<Usluga>) (ArrayList<?>) DatabaseBroker.getInstance().select((Usluga) odo);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }
    
    public List<Usluga> vratiUsluge(){
        return usluge;
    }
    
}
