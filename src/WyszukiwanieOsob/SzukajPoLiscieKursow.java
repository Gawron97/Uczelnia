package WyszukiwanieOsob;
import Osoby.Osoba;
import Osoby.Student;

import java.util.ArrayList;

public class SzukajPoLiscieKursow implements WyszukiwanieOsoby{

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos) {

        ArrayList<Integer> indeksy = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClass().equals(typ)) {
                if (((Student) a.get(i)).getLista_kursow() == cos)
                    indeksy.add(i);
            }
        }
        return indeksy;
    }

}
