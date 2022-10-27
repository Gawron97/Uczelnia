package Osoby;

import java.io.Serial;
import java.io.Serializable;

public abstract class Osoba implements Serializable {

    protected String imie;
    protected String nazwisko;
    protected String pesel;
    protected int wiek;
    protected String plec;

    public Osoba(String imie, String nazwisko, String pesel, int wiek, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return
                "imie: " + imie + '\n' +
                "nazwisko: " + nazwisko + '\n' +
                "pesel: " + pesel + '\n' +
                "wiek: " + wiek + "\n" +
                "plec: " + plec + '\n';
    }

    @Override
    public boolean equals(Object other){

        if(other == null) return false;

        if(other instanceof Osoba){
            Osoba osoba = (Osoba) other;
            if(imie == osoba.getImie() && nazwisko == osoba.getNazwisko() && pesel == osoba.getPesel()
                    && wiek == osoba.getWiek() && plec == osoba.getPlec()) return true;

        }
        return false;
    }
}
