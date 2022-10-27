package Osoby;

import java.io.Serializable;

public class PracownikBadawczo_Dydaktyczny extends PracownikUczelni implements Serializable {

    private int punktacja_z_dorobku_naukowego;

    public PracownikBadawczo_Dydaktyczny(String imie, String nazwisko, String pesel, int wiek, String plec,
                                         String stanowisko, int staz_pracy, double pensja,
                                         int punktacja_z_dorobku_naukowego) {
        super(imie, nazwisko, pesel, wiek, plec, stanowisko, staz_pracy, pensja);
        this.punktacja_z_dorobku_naukowego = punktacja_z_dorobku_naukowego;
    }

    public int getPunktacja_z_dorobku_naukowego() {
        return punktacja_z_dorobku_naukowego;
    }

    public void setPunktacja_z_dorobku_naukowego(int punktacja_z_dorobku_naukowego) {
        this.punktacja_z_dorobku_naukowego = punktacja_z_dorobku_naukowego;
    }

    @Override
    public String toString(){
        return "{" + "\n" +
                "Pracownik Badawczo-Dydaktyczny" + "\n" +
                super.toString() +
                "punktacja z dorobku naukowego: " + punktacja_z_dorobku_naukowego + "\n" +
                "}" + "\n";
    }

}
