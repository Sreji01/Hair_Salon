/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import domain.EvidencijaTermina;
import domain.Frizer;
import domain.FrizerskiSalon;
import domain.Musterija;
import domain.TipMusterije;
import domain.Usluga;
import java.util.ArrayList;
import java.util.List;
import so.evidencijaTermina.KreirajEvidencijaTermina;
import so.evidencijaTermina.VratiListuEvidencijaTermina;
import so.evidencijaTermina.PretraziEvidencijaTermina;
import so.evidencijaTermina.VratiListuSviEvidencijaTermina;
import so.evidencijaTermina.PromeniEvidencijaTermina;
import so.frizer.PrijaviFrizer;
import so.frizer.VratiListuSviFrizer;
import so.frizerskiSalon.KreirajFrizerskiSalon;
import so.musterija.KreirajMusterija;
import so.musterija.VratiListuMusterija;
import so.musterija.PretraziMusterija;
import so.musterija.ObrisiMusterija;
import so.musterija.VratiListuSviMusterija;
import so.musterija.PromeniMusterija;
import so.tipMusterije.VratiListuSviTipMusterije;
import so.usluga.VratiListuSviUsluga;

/**
 *
 * @author Sreja
 */
public class Controller {
    
    private static Controller instance;
    private List<Frizer> trenutnoUlogovani = new ArrayList<>();
    private int MaksBrojKlijenata;
    
    private Controller() {
        
    }
    
    public int getMaksBrojKlijenata() {
        return MaksBrojKlijenata;
    }
    
    public void setMaksBrojKlijenata(int MaksBrojKlijenata) {
        this.MaksBrojKlijenata = MaksBrojKlijenata;
    }
    
    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
    
    public Frizer prijaviFrizer(Frizer frizer) throws Exception {
        if(trenutnoUlogovani.size() == MaksBrojKlijenata){
            throw new Exception("Server je pun!");
        }
        if(trenutnoUlogovani.contains(frizer)){
            throw new Exception("Vec ste ulogovani!");
        }
        PrijaviFrizer prijaviFrizer = new PrijaviFrizer();
        prijaviFrizer.execute(frizer);
        trenutnoUlogovani.add(frizer);
        return prijaviFrizer.vratiFrizera();
    }
    
    public void odjaviFrizer(Frizer frizer) {
        for (Frizer f : trenutnoUlogovani) {
            if(f.getUsername().equals(frizer.getPassword()) && f.getPassword().equals(frizer.getPassword())){
                trenutnoUlogovani.remove(f);
                break;
            }
        }
    }
    
    public List<TipMusterije> vratiListuSviTipMusterije() throws Exception {
        VratiListuSviTipMusterije vratiListuSviTipMusterije = new VratiListuSviTipMusterije();
        TipMusterije tipMusterije = new TipMusterije();
        vratiListuSviTipMusterije.execute(tipMusterije);
        return vratiListuSviTipMusterije.vratiTipoveMusterija();
    }
    
    public Musterija kreairajMusterija() throws Exception {
        KreirajMusterija kreirajMusterija = new KreirajMusterija();
        Musterija musterija = new Musterija();
        kreirajMusterija.execute(musterija);
        return kreirajMusterija.vratiMusteriju();
    }

    public void promeniMusterija(Musterija musterija) throws Exception {
        PromeniMusterija promeniMusterija = new PromeniMusterija();
        promeniMusterija.execute(musterija);
    }

    public List<Musterija> vratiListuMusterija(Musterija musterija) throws Exception {
        VratiListuMusterija vratiListuMusterija = new VratiListuMusterija();
        vratiListuMusterija.execute(musterija);
        return vratiListuMusterija.vratiMusterije();
    }

    public Musterija pretraziMusterija(Musterija musterija) throws Exception {
        PretraziMusterija pretraziMusterija = new PretraziMusterija();
        pretraziMusterija.execute(musterija);
        return pretraziMusterija.vratiMusteriju();
    }

    public void obrisiMusteriju(Musterija musterija) throws Exception {
        ObrisiMusterija obrisiMusterija = new ObrisiMusterija();
        obrisiMusterija.execute(musterija);
    }

    public void kreirajFrizerskiSalon(FrizerskiSalon frizerskiSalon) throws Exception {
        KreirajFrizerskiSalon kreirajFrizerskiSalon = new KreirajFrizerskiSalon();
        kreirajFrizerskiSalon.execute(frizerskiSalon);
    }

    public List<Frizer> vratiListuSviFrizer() throws Exception {
        VratiListuSviFrizer vratiListuSviFrizer = new VratiListuSviFrizer();
        Frizer frizer = new Frizer();
        vratiListuSviFrizer.execute(frizer);
        return vratiListuSviFrizer.vratiFrizere();
    }

    public List<Musterija> vratiListuSviMusterija() throws Exception {
        VratiListuSviMusterija vratiListuSviMusterija = new VratiListuSviMusterija();
        Musterija musterija = new Musterija();
        vratiListuSviMusterija.execute(musterija);
        return vratiListuSviMusterija.vratiMusterije();
    }

    public List<Usluga> vratiListuSviUsluga() throws Exception {
        VratiListuSviUsluga vratiListuSviUsluga = new VratiListuSviUsluga();
        Usluga usluga = new Usluga();
        vratiListuSviUsluga.execute(usluga);
        return vratiListuSviUsluga.vratiUsluge();
    }

    public EvidencijaTermina kreirajEvidencijaTermina() throws Exception {
        KreirajEvidencijaTermina kreirajEvidencijaTermina = new KreirajEvidencijaTermina();
        EvidencijaTermina evidencijaTermina = new EvidencijaTermina();
        kreirajEvidencijaTermina.execute(evidencijaTermina);
        return kreirajEvidencijaTermina.vratiEvidencijuTermina();
    }

    public void promeniEvidencijaTermina(EvidencijaTermina evidencijaTermina) throws Exception {
        PromeniEvidencijaTermina promeniEvidencijaTermina = new PromeniEvidencijaTermina();
        promeniEvidencijaTermina.execute(evidencijaTermina);
    }

    public List<EvidencijaTermina> vratiListuEvidencijaTermina(EvidencijaTermina evidencijaTermina) throws Exception {
        VratiListuEvidencijaTermina vratiListuEvidencijaTermina = new VratiListuEvidencijaTermina();
        vratiListuEvidencijaTermina.execute(evidencijaTermina);
        for (EvidencijaTermina evidencijaTermina1 : vratiListuEvidencijaTermina.vratiEvidencijeTermina()) {
            System.out.println(evidencijaTermina1.getUkupanIznos());
            System.out.println(evidencijaTermina1.getUkupnoTrajanje());
        }
        return vratiListuEvidencijaTermina.vratiEvidencijeTermina();
    }

    public EvidencijaTermina pretraziEvidencijaTermina(EvidencijaTermina evidencijaTermina) throws Exception {
        PretraziEvidencijaTermina pretraziEvidencijaTermina = new PretraziEvidencijaTermina();
        pretraziEvidencijaTermina.execute(evidencijaTermina);
        return pretraziEvidencijaTermina.vratiEvidencijuTermina();
    }

    public List<EvidencijaTermina> vratiListuSviEvidencijaTermina() throws Exception {
        VratiListuSviEvidencijaTermina vratiListuSviEvidencijaTermina = new VratiListuSviEvidencijaTermina();
        EvidencijaTermina evidencijaTermina = new EvidencijaTermina();
        vratiListuSviEvidencijaTermina.execute(evidencijaTermina);
        return vratiListuSviEvidencijaTermina.vratiEvidencijeTermina();
    }
    
}
