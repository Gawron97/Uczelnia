package WyszukiwanieOsob;
import Osoby.Osoba;
import Osoby.PracownikBadawczo_Dydaktyczny;

import java.util.ArrayList;

public class SzukajPoPunktacjizDorobkuNaukowego implements WyszukiwanieOsoby{

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos) {

        ArrayList<Integer> indeksy = new ArrayList<>();
        int cos1 = Integer.parseInt((String) cos);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClass().equals(typ)) {
                if (((PracownikBadawczo_Dydaktyczny) a.get(i)).getPunktacja_z_dorobku_naukowego() == cos1)
                    indeksy.add(i);
            }
        }
        return indeksy;
    }

}
