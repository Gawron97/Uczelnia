package WyszukiwanieOsob;
import Osoby.Osoba;

import java.util.ArrayList;

public class SzukajPoNazwisku implements WyszukiwanieOsoby {

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos){

        ArrayList<Integer> indeksy = new ArrayList<>();

        for(int i = 0; i<a.size(); i++){
            if(a.get(i).getClass().equals(typ)){
                if(((Osoba)a.get(i)).getNazwisko().compareTo((String) cos) == 0)
                    indeksy.add(i);
            }
        }
        return indeksy;
    }
}
