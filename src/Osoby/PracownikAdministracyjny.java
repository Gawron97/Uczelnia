package Osoby;

import java.io.Serializable;

public class PracownikAdministracyjny extends PracownikUczelni implements Serializable {

    private int liczba_nadgodzin;

    public PracownikAdministracyjny(String imie, String nazwisko, String pesel, int wiek, String plec, String stanowisko,
                                    int staz_pracy, double pensja, int liczba_nadgodzin) {
        super(imie, nazwisko, pesel, wiek, plec, stanowisko, staz_pracy, pensja);
        this.liczba_nadgodzin = liczba_nadgodzin;
    }

    public int getLiczba_nadgodzin() {
        return liczba_nadgodzin;
    }

    public void setLiczba_nadgodzin(int liczba_nadgodzin) {
        this.liczba_nadgodzin = liczba_nadgodzin;
    }

    @Override
    public String toString(){
        return "{" + "\n" +
                "Pracownik Administracyjny" + "\n" +
                super.toString() +
                "liczba nadgodzin: " + liczba_nadgodzin + "\n" +
                "}" + "\n";
    }

}
