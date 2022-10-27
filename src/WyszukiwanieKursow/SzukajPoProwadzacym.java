package WyszukiwanieKursow;
import Kursy.Kurs;

import java.util.ArrayList;

public class SzukajPoProwadzacym implements WyszukiwanieKursy{

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Kurs> a, Object cos) {
        ArrayList<Integer> indeksy = new ArrayList<>();

        for(int i=0; i<a.size(); i++){
            if(a.get(i).getProwadzacy_imie_nazwisko().compareTo((String) cos) == 0)
                indeksy.add(i);
        }

        return indeksy;
    }

}
