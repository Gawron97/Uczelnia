package WyszukiwanieOsob;

import Osoby.Osoba;

import java.util.ArrayList;

public interface WyszukiwanieOsoby {

    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos);

}
