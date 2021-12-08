package sample;

public class Pracownicy {
    private String nazwisko;
    private String login;
    private  String haslo;

    public Pracownicy(String nazwisko, String login, String haslo) {
        this.nazwisko = nazwisko;
        this.login = login;
        this.haslo = haslo;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }
}
