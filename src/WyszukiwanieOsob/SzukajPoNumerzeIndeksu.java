package WyszukiwanieOsob;
import Osoby.Osoba;
import Osoby.Student;

import java.util.ArrayList;

public class SzukajPoNumerzeIndeksu implements WyszukiwanieOsoby{

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos) {

        ArrayList<Integer> indeksy = new ArrayList<>();
        int cos1 = Integer.parseInt((String) cos);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClass().equals(typ)) {
                if (((Student) a.get(i)).getNr_indeksu() == cos1)
                    indeksy.add(i);
            }
        }
        return indeksy;
    }

}
