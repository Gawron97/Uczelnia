package Comparatory;


import Kursy.Kurs;

import java.util.Comparator;

public class CompareKursyPoNazwiskuProwadzacego implements Comparator<Kurs> {

    @Override
    public int compare(Kurs o1, Kurs o2){
        String [] prow1 = o1.getProwadzacy_imie_nazwisko().split(" ");
        String [] prow2 = o2.getProwadzacy_imie_nazwisko().split(" ");

        return prow1[1].compareTo(prow2[1]);
    }
}
