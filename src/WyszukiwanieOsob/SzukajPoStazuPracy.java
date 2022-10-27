package WyszukiwanieOsob;
import Osoby.Osoba;
import Osoby.PracownikUczelni;

import java.util.ArrayList;

public class SzukajPoStazuPracy implements WyszukiwanieOsoby{

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos) {

        ArrayList<Integer> indeksy = new ArrayList<>();
        int cos1 = Integer.parseInt((String) cos);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClass().equals(typ)) {
                if (((PracownikUczelni) a.get(i)).getStaz_pracy() == cos1)
                    indeksy.add(i);
            }
        }
        return indeksy;
    }
}
