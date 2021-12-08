package sample;
public class Klient {
    private String nazwisko;
    private String mail;
    private String telefon;

    public Klient(String nazwisko, String mail, String telefon) {
        this.nazwisko = nazwisko;
        this.mail = mail;
        this.telefon = telefon;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
