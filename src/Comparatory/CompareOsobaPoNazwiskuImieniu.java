package Comparatory;

import Osoby.Osoba;

import java.util.Comparator;

public class CompareOsobaPoNazwiskuImieniu implements Comparator<Osoba> {

    @Override
    public int compare(Osoba o1, Osoba o2){
        int res = o1.getNazwisko().compareTo(o2.getNazwisko());
        if(res == 0){
            res = o1.getImie().compareTo(o2.getImie());
        }
        return res;
    }
}
