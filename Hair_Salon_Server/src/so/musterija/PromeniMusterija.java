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
public class PromeniMusterija extends ApstraktnaSO {

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        DatabaseBroker.getInstance().update((Musterija) odo);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
        Musterija musterija = (Musterija) odo;
        if (!musterija.getIme().matches("[A-Za-z]+")) {
            throw new Exception();
        }
        if (!Character.isUpperCase(musterija.getIme().charAt(0))) {
            throw new Exception();
        }
        if (!musterija.getPrezime().matches("[A-Za-z]+")) {
            throw new Exception();
        }
        if (!Character.isUpperCase(musterija.getPrezime().charAt(0))) {
            throw new Exception();
        }
        if (!musterija.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            throw new Exception();
        }
        if (!musterija.getTelefon().matches("[0-9]+")) {
            throw new Exception();
        }
        if (musterija.getTelefon().length() < 9 || musterija.getTelefon().length() > 10) {
            throw new Exception();
        }
    }

}
