package Osoby;

import java.io.Serializable;
import java.util.Objects;

public abstract class PracownikUczelni extends Osoba implements Serializable {

    protected String stanowisko;
    protected int staz_pracy;
    protected double pensja;

    public PracownikUczelni(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko,
                            int staz_pracy, double pensja) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.stanowisko = stanowisko;
        this.staz_pracy = staz_pracy;
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public int getStaz_pracy() {
        return staz_pracy;
    }

    public void setStaz_pracy(int staz_pracy) {
        this.staz_pracy = staz_pracy;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString(){
        return super.toString() +
                "stanowisko: " + stanowisko + "\n" +
                "staz pracy: " + staz_pracy + "\n" +
                "pensja: " + pensja + "\n";
    }

    @Override
    public boolean equals(Object other){
        if(other == null) return false;
        if(other instanceof PracownikUczelni){
            PracownikUczelni pracownik = ((PracownikUczelni) other);
            if(pracownik.getPesel().compareTo(pesel) == 0)
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }
}
