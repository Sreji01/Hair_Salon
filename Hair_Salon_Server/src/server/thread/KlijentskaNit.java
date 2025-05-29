/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server.thread;

import communication.Odgovor;

import communication.Zahtev;
import domain.EvidencijaTermina;
import domain.Frizer;
import domain.FrizerskiSalon;
import domain.Musterija;
import domain.TipMusterije;
import domain.Usluga;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;
import logic.Controller;

/**
 *
 * @author Sreja
 */
public class KlijentskaNit extends Thread {

    private Socket clientSocket;

    public KlijentskaNit() {
    }

    public KlijentskaNit(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            while (!clientSocket.isClosed()) {
                ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
                Zahtev zahtev = (Zahtev) in.readObject();
                Odgovor odgovor = obradiZahtev(zahtev);
                ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
                out.writeObject(odgovor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Odgovor obradiZahtev(Zahtev zahtev) {
        Odgovor odgovor = new Odgovor();
        List<TipMusterije> tipoviMusterija;
        List<Musterija> musterije;
        List<Frizer> frizeri;
        List<Usluga> usluge;
        List<EvidencijaTermina> evidencijeTermina;
        Musterija musterija;
        Frizer frizer;
        EvidencijaTermina evidencijaTermina;
        try {
            switch (zahtev.getOperacija()) {
                case PRIJAVI_FRIZER:
                    frizer = Controller.getInstance().prijaviFrizer((Frizer) zahtev.getParametar());
                    odgovor.setRezultat(frizer);
                    break;
                case ODJAVI_FRIZER:
                    Controller.getInstance().odjaviFrizer((Frizer) zahtev.getParametar());
                    break;
                case VRATI_LISTU_SVI_TIP_MUSTERIJE:
                    tipoviMusterija = Controller.getInstance().vratiListuSviTipMusterije();
                    odgovor.setRezultat(tipoviMusterija);
                    break;
                case KREIRAJ_MUSTERIJA:
                    musterija = Controller.getInstance().kreairajMusterija();
                    odgovor.setRezultat(musterija);
                    break;
                case PROMENI_MUSTERIJA:
                    Controller.getInstance().promeniMusterija((Musterija) zahtev.getParametar());
                    break;
                case VRATI_LISTU_MUSTERIJA:
                    musterije = Controller.getInstance().vratiListuMusterija((Musterija) zahtev.getParametar());
                    odgovor.setRezultat(musterije);
                    break;
                case PRETRAZI_MUSTERIJA:
                    musterija = Controller.getInstance().pretraziMusterija((Musterija) zahtev.getParametar());
                    odgovor.setRezultat(musterija);
                    break;
                case OBRISI_MUSTERIJU:
                    Controller.getInstance().obrisiMusteriju((Musterija) zahtev.getParametar());
                    break;
                case KREIRAJ_FRIZERSKI_SALON:
                    Controller.getInstance().kreirajFrizerskiSalon((FrizerskiSalon) zahtev.getParametar());
                    break;
                case VRATI_LISTU_SVI_FRIZER:
                    frizeri = Controller.getInstance().vratiListuSviFrizer();
                    odgovor.setRezultat(frizeri);
                    break;
                case VRATI_LISTU_SVI_MUSTERIJA:
                    musterije = Controller.getInstance().vratiListuSviMusterija();
                    odgovor.setRezultat(musterije);
                    break;
                case VRATI_LISTU_SVI_USLUGA:
                    usluge = Controller.getInstance().vratiListuSviUsluga();
                    odgovor.setRezultat(usluge);
                    break;
                case KREIRAJ_EVIDENCIJA_TERMINA:
                    evidencijaTermina = Controller.getInstance().kreirajEvidencijaTermina();
                    odgovor.setRezultat(evidencijaTermina);
                    break;
                case PROMENI_EVIDENCIJA_TERMINA:
                    Controller.getInstance().promeniEvidencijaTermina((EvidencijaTermina) zahtev.getParametar());
                    break;
                case VRATI_LISTU_EVIDENCIJA_TERMINA:
                    evidencijeTermina = Controller.getInstance().vratiListuEvidencijaTermina((EvidencijaTermina) zahtev.getParametar());
                    odgovor.setRezultat(evidencijeTermina);
                    break;
                case PRETRAZI_EVIDENCIJA_TERMINA:
                    evidencijaTermina = Controller.getInstance().pretraziEvidencijaTermina((EvidencijaTermina) zahtev.getParametar());
                    odgovor.setRezultat(evidencijaTermina);
                    break;
                case VRATI_LISTU_SVI_EVIDENCIJA_TERMINA:
                    evidencijeTermina = Controller.getInstance().vratiListuSviEvidencijaTermina();
                    odgovor.setRezultat(evidencijeTermina);
                    break;
                default:
                    throw new AssertionError();
            }

        } catch (Exception e) {
            odgovor.setException(e);
        }
        return odgovor;
    }

}
