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
public class PrijaviFrizer extends ApstraktnaSO {

    private Frizer frizer;

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        frizer = (Frizer) DatabaseBroker.getInstance().selectOne((Frizer) odo);
        if(frizer.getIdFrizer() == 0){
            throw new Exception("Korisnicko ime i sifra nisu ispravni!");
        }
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }
    
    public Frizer vratiFrizera(){
        return frizer;
    }
}

