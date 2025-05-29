/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.musterija;

import domain.Musterija;
import domain.OpstiDomenskiObjekat;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import respository.db.DatabaseBroker;
import so.ApstraktnaSO;

/**
 *
 * @author Sreja
 */
public class KreirajMusterija extends ApstraktnaSO {

    private Musterija musterija;

    @Override
    public void executeOperation(OpstiDomenskiObjekat odo) throws Exception {
        PreparedStatement ps = DatabaseBroker.getInstance().insert((Musterija) odo);
        ResultSet resultSet = ps.getGeneratedKeys();
        resultSet.next();
        long idMusterija = resultSet.getLong(1);
        musterija = new Musterija();
        musterija.setIdMusterija(idMusterija);
    }

    @Override
    protected void validate(OpstiDomenskiObjekat odo) throws Exception {
    }

    public Musterija vratiMusteriju() {
        return musterija;
    }

}
