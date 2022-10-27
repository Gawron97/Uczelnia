package Detector;
import Kursy.Kurs;
import Osoby.*;
import WyszukiwanieKursow.*;
import WyszukiwanieOsob.*;

import java.util.ArrayList;

public class Detector {

    private WyszukiwanieOsoby detect_osoby = null;
    private WyszukiwanieKursy detect_kursy = null;

    private void ustawWyszukiwanieOsoby(String poCzym){
        switch (poCzym){
            case "imie":
                detect_osoby = new SzukajPoImieniu();
                break;

            case "wiek":
                detect_osoby = new SzukajPoWieku();
                break;

            case "stanowisko":
                detect_osoby = new SzukajPoStanowisku();
                break;

            case "IStopien":
                detect_osoby = new SzukajPoIStopniu();
                break;

            case "IIStopien":
                detect_osoby = new SzukajPoIIStopniu();
                break;

            case "liczba nadgodzin":
                detect_osoby = new SzukajPoLiczbieNadgodzin();
                break;

            case "lista kursow":
                detect_osoby = new SzukajPoLiscieKursow();
                break;

            case "nazwisko":
                detect_osoby = new SzukajPoNazwisku();
                break;

            case "niestacjonarne":
                detect_osoby = new SzukajPoNieStacjonarnych();
                break;

            case "numer indeksu":
                detect_osoby = new SzukajPoNumerzeIndeksu();
                break;

            case "pensja":
                detect_osoby = new SzukajPoPensji();
                break;

            case "plec":
                detect_osoby = new SzukajPoPlci();
                break;

            case "punktacja z dorobku naukowego":
                detect_osoby = new SzukajPoPunktacjizDorobkuNaukowego();
                break;

            case "stacjonarne":
                detect_osoby = new SzukajPoStacjonarnych();
                break;

            case "staz pracy":
                detect_osoby = new SzukajPoStazuPracy();
                break;

            case "uczestnik ERASMUSA":
                detect_osoby = new SzukajPoUczestnikachERASMUSA();
                break;

            case "pesel":
                detect_osoby= new SzukajPoPeslu();
                break;

            default:
                System.out.printf("brak wybranej opcji szukania" + "\n");
                break;
        }
    }

    public ArrayList<Integer> wyszukaj(ArrayList<Osoba> a, Class<?> typ, String poCzym, Object cos){
        ustawWyszukiwanieOsoby(poCzym);
        return detect_osoby.szukaj(a, typ, cos);
    }

    public ArrayList<Integer> wyszukajStudent(ArrayList<Osoba> a, String poCzym, Object cos){
        ustawWyszukiwanieOsoby(poCzym);
        return detect_osoby.szukaj(a, Student.class, cos);
    }

    public ArrayList<Integer> wyszukajPracownikAdministracyjny(ArrayList<Osoba> a, String poCzym, Object cos){
        ustawWyszukiwanieOsoby(poCzym);
        return detect_osoby.szukaj(a, PracownikAdministracyjny.class, cos);
    }

    public ArrayList<Integer> wyszukajPracownikBadawczo_Dydaktyczny(ArrayList<Osoba> a, String poCzym, Object cos){
        ustawWyszukiwanieOsoby(poCzym);
        return detect_osoby.szukaj(a, PracownikBadawczo_Dydaktyczny.class, cos);
    }

    public void ustawWyszukiwanieKursu(String poCzym){

        switch (poCzym){
            case "nazwa":
                detect_kursy = new SzukajPoNazwieKursu();
                break;

            case "prowadzacy":
                detect_kursy = new SzukajPoProwadzacym();
                break;

            case "ECTS":
                detect_kursy = new SzukajPoECTS();
                break;
        }
    }

    public ArrayList<Integer> wyszukajKurs(ArrayList<Kurs> a, String poCzym, Object cos){
        ustawWyszukiwanieKursu(poCzym);
        return detect_kursy.szukaj(a, cos);
    }

}
