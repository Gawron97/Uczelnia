package Rejestr;

import Osoby.Osoba;

import java.util.ArrayList;
import java.util.Comparator;

public interface Rejestr {

    public void dodaj(ArrayList<Object> a);

    public void dodaj(Object object);

    public void usun(Object object);

    public void usun(int index);

    public void usun(ArrayList<Integer> a);

    public void wyswietl();

    public void wyswietlPoIndeksach(ArrayList<Integer> a);

    public void sort(Comparator comp);

}
