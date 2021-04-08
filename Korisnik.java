package models;

public class Korisnik extends Model {
    protected String table = "korisnici";

    private String username;
    private String password;
    private String ime_prezime;

    public Korisnik() { }
    public Korisnik(String username, String password, String ime_prezime) {
        this.username = username;
        this.password = password;
        this.ime_prezime = ime_prezime;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setIme_prezime(String ime_prezime) {
        this.ime_prezime = ime_prezime;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getIme_prezime() {
        return ime_prezime;
    }

    @Override
    public String toString() {
        return id + ". " + ime_prezime;
    }
}