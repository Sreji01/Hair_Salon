/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.evidencijaTermina;

import domain.EvidencijaTermina;
import domain.OpstiDomenskiObjekat;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;
import java.sql.*;

/**
 *
 * @author Sreja
 */
public class KreirajEvidencijaTermina extends ApstraktnaSO {
    private EvidencijaTermina evidencijaTermina;

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        PreparedStatement ps = DatabaseBroker.getInstance().insert((EvidencijaTermina) odo);
        ResultSet resultSet = ps.getGeneratedKeys();
        resultSet.next();
        long idEvidencijaTermina = resultSet.getLong(1);
        evidencijaTermina = new EvidencijaTermina();
        evidencijaTermina.setIdEvidencijaTermina(idEvidencijaTermina);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }
    
    public EvidencijaTermina vratiEvidencijuTermina(){
        return evidencijaTermina;
    }
}
