package WyszukiwanieOsob;
import Osoby.Osoba;

import java.util.ArrayList;

public class SzukajPoWieku implements WyszukiwanieOsoby{

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos){

        ArrayList<Integer> indeksy = new ArrayList<>();
        int cos1 = Integer.parseInt((String) cos);

        for(int i = 0; i<a.size(); i++){
            if(a.get(i).getClass().equals(typ)){
                if(((Osoba)a.get(i)).getWiek() == cos1)
                    indeksy.add(i);
            }
        }
        return indeksy;
    }

}
