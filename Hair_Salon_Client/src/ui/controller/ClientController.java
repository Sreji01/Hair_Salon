/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.controller;

import communication.Odgovor;
import communication.Operacije;
import communication.Zahtev;
import domain.EvidencijaTermina;
import domain.Frizer;
import domain.FrizerskiSalon;
import domain.Musterija;
import domain.TipMusterije;
import domain.Usluga;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

/**
 *
 * @author Marko
 */
public class ClientController {

    private Socket socket;

    private static ClientController instance;

    private ClientController() throws Exception {
        try {
            socket = new Socket("localhost", 9000);
        } catch (IOException ex) {
            throw new Exception("Server je ugasen!");
        }
    }

    public static ClientController getInstance() throws Exception {
        if (instance == null) {
            instance = new ClientController();
        }
        return instance;
    }

    private Object posaljiZahtev(Operacije operacija, Object parametar) throws Exception {
        Zahtev zahtev = new Zahtev(operacija, parametar);

        ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
        out.writeObject(zahtev);
        ///
        ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
        Odgovor odgovor = (Odgovor) in.readObject();
        if (odgovor.getException() == null) {
            return odgovor.getRezultat();
        } else {
            throw odgovor.getException();
        }
    }

    public Frizer prijaviFrizer(Frizer frizer) throws Exception {
        return (Frizer) posaljiZahtev(Operacije.PRIJAVI_FRIZER, frizer);
    }
    
    public void odjaviFrizer(Frizer frizer) throws Exception {
        posaljiZahtev(Operacije.ODJAVI_FRIZER, frizer);
    }

    public List<TipMusterije> vratiListuSviTipMusterije() throws Exception {
        return (List<TipMusterije>) posaljiZahtev(Operacije.VRATI_LISTU_SVI_TIP_MUSTERIJE, null);
    }

    public Musterija kreirajMusterija() throws Exception {
        return (Musterija) posaljiZahtev(Operacije.KREIRAJ_MUSTERIJA, null);
    }

    public void promeniMusterija(Musterija musterija) throws Exception {
        posaljiZahtev(Operacije.PROMENI_MUSTERIJA, musterija);
    }

    public List<Musterija> vratiListuMusterija(Musterija musterija) throws Exception {
        return (List<Musterija>) posaljiZahtev(Operacije.VRATI_LISTU_MUSTERIJA, musterija);
    }

    public Musterija pretraziMusterija(Musterija musterija) throws Exception {
        return (Musterija) posaljiZahtev(Operacije.PRETRAZI_MUSTERIJA, musterija);
    }

    public void obrisiMusteriju(Musterija musterija) throws Exception {
        posaljiZahtev(Operacije.OBRISI_MUSTERIJU, musterija);
    }

    public void kreirajFrizerskiSalon(FrizerskiSalon frizerskiSalon) throws Exception {
        posaljiZahtev(Operacije.KREIRAJ_FRIZERSKI_SALON, frizerskiSalon);
    }

    public List<Frizer> vratiListuSviFrizer() throws Exception {
        return (List<Frizer>) posaljiZahtev(Operacije.VRATI_LISTU_SVI_FRIZER, null);
    }

    public List<Musterija> vratiListuSviMusterija() throws Exception {
        return (List<Musterija>) posaljiZahtev(Operacije.VRATI_LISTU_SVI_MUSTERIJA, null);
    }

    public List<Usluga> vratiListuSviUsluga() throws Exception {
        return (List<Usluga>) posaljiZahtev(Operacije.VRATI_LISTU_SVI_USLUGA, null);
    }

    public EvidencijaTermina kreirajEvidencijaTermina() throws Exception {
        return (EvidencijaTermina) posaljiZahtev(Operacije.KREIRAJ_EVIDENCIJA_TERMINA, null);
    }

    public void promeniEvidencijaTermina(EvidencijaTermina evidencijaTermina) throws Exception {
        posaljiZahtev(Operacije.PROMENI_EVIDENCIJA_TERMINA, evidencijaTermina);
    }

    public List<EvidencijaTermina> vratiListuEvidencijaTermina(EvidencijaTermina evidencijaTermina) throws Exception {
        return (List<EvidencijaTermina>) posaljiZahtev(Operacije.VRATI_LISTU_EVIDENCIJA_TERMINA, evidencijaTermina);
    }

    public EvidencijaTermina pretraziEvidencijaTermina(EvidencijaTermina evidencijaTermina) throws Exception {
        return (EvidencijaTermina) posaljiZahtev(Operacije.PRETRAZI_EVIDENCIJA_TERMINA, evidencijaTermina);
    }

    public List<EvidencijaTermina> vratiListuSviEvidencijaTermina() throws Exception {
        return (List<EvidencijaTermina>) posaljiZahtev(Operacije.VRATI_LISTU_SVI_EVIDENCIJA_TERMINA, null);
    }

}
