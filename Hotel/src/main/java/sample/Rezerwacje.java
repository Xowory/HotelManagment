package sample;

public class Rezerwacje {
    private int nr_pokoju;
    private String data_od;
    private String data_do;
    private String nazwisko;

    public Rezerwacje(int nr_pokoju, String data_od, String data_do, String nazwisko) {
        this.nr_pokoju = nr_pokoju;
        this.data_od = data_od;
        this.data_do = data_do;
        this.nazwisko = nazwisko;
    }

    public int getNr_pokoju() {
        return nr_pokoju;
    }

    public void setNr_pokoju(int nr_pokoju) {
        this.nr_pokoju = nr_pokoju;
    }

    public String getData_od() {
        return data_od;
    }

    public void setData_od(String data_od) {
        this.data_od = data_od;
    }

    public String getData_do() {
        return data_do;
    }

    public void setData_do(String data_do) {
        this.data_do = data_do;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Rezerwacje{" +
                "nr_pokoju=" + nr_pokoju +
                ", data_od='" + data_od + '\'' +
                ", data_do='" + data_do + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
