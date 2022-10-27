package WyszukiwanieOsob;
import Osoby.Osoba;
import Osoby.PracownikUczelni;

import java.util.ArrayList;

public class SzukajPoStanowisku implements WyszukiwanieOsoby {

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos) {

        ArrayList<Integer> indeksy = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClass().equals(typ)) {
                if (((PracownikUczelni) a.get(i)).getStanowisko().compareTo((String) cos) == 0)
                    indeksy.add(i);
            }
        }
        return indeksy;
    }
}
