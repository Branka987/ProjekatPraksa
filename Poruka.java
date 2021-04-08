/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Timestamp;

/**
 *
 * @author dusan
 */
public class Poruka extends Model {
    protected String table = "poruke";

    private String poruka;
    private Timestamp vreme;
    private long korisnik_id;
    
    public Korisnik getKorisnik() {
        Korisnik k = new Korisnik();
        k = (Korisnik)k.find((int)korisnik_id);
        return k;
    }

    public Poruka() { }
    public Poruka(String poruka, Long korisnik_id) {
        this.poruka = poruka;
        this.korisnik_id = korisnik_id;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public Timestamp getVreme() {
        return vreme;
    }

    public void setVreme(Timestamp vreme) {
        this.vreme = vreme;
    }

    public Long getKorisnik_id() {
        return korisnik_id;
    }

    public void setKorisnik_id(Long korisnik_id) {
        this.korisnik_id = korisnik_id;
    }


    @Override
    public String toString() {
        Korisnik k = new Korisnik();
        k = (Korisnik)k.find((int)korisnik_id);
        return id + ". " + k.getIme_prezime() + ", " + poruka + " " + vreme;
    }
}
