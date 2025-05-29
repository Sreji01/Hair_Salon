/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.frizerskiSalon;
import domain.FrizerskiSalon;
import domain.OpstiDomenskiObjekat;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;

/**
 *
 * @author Sreja
 */
public class KreirajFrizerskiSalon extends ApstraktnaSO{

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        DatabaseBroker.getInstance().insert((FrizerskiSalon) odo);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
        FrizerskiSalon frizerskiSalon = (FrizerskiSalon) odo;
        if (!frizerskiSalon.getAdresa().matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z0-9\\s]+$")) {
            throw new Exception();
        }
    }
}
