package main;

import Comparatory.CompareOsobaPoNazwiskuWieku;
import Osoby.*;
import Detector.Detector;
import Kursy.*;
import Rejestr.Kursy;
import Rejestr.Lista;
import Rejestr.Rejestr;
import GUI.ramka.Ramka;
import java.awt.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Detector detector = new Detector();
        Rejestr zajecia = new Kursy();
        Rejestr a = new Lista();

        Scanner scanner = new Scanner(System.in);

        System.out.println("jesli chcesz rozpoczac dodawanie, wpisz 1, jesli nie wpisz 2");

        if(scanner.nextInt() == 1) {

            System.out.println("podaj co chcesz zrobic:" + "\n" +
                    "1. dodac studenta" + "\n" +
                    "2. dodac Pracownika Administracyjnego" + "\n" +
                    "3. dodac Pracownika Badawczo-Dydaktycznego" + "\n" +
                    "4. dodac kurs" + "\n" +
                    "5. zakoncz");


            int pom = scanner.nextInt();

            while (pom != 5) {

                switch (pom) {

                    case 1: {
                        try {
                            System.out.println("podaj dane studenta: imie, nazwisko, pesel, wiek, plec, numer indeksu, " +
                                    "czy uczestnik ERASMUS, czy I-stopien, czy II-stopien, czy studia stacjonarne, " +
                                    "czy studia niestacjonarne");
                            a.dodaj(new Student(scanner.next(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.next(),
                                    scanner.nextInt(), scanner.nextBoolean(), scanner.nextBoolean(),
                                    scanner.nextBoolean(), scanner.nextBoolean(), scanner.nextBoolean()));
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                        break;
                    }

                    case 2: {
                        try {
                            System.out.println("podaj dane pracownika administracyjnego: imie, nazwisko, pesel, wiek," +
                                    " plec, stanowisko, staz pracy, pensja, liczba nadgodzin");
                            a.dodaj(new PracownikAdministracyjny(scanner.next(), scanner.next(), scanner.next(),
                                    scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextDouble(),
                                    scanner.nextInt()));
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                        break;
                    }

                    case 3: {
                        try {
                            System.out.println("podaj dane pracownika badawczo dydaktycznego: imie, nazwisko, pesel, wiek, " +
                                    "plec, stanowisko, staz pracy, pensja, punktacja z dorobku naukowego");

                            a.dodaj(new PracownikBadawczo_Dydaktyczny(scanner.next(), scanner.next(), scanner.next(),
                                    scanner.nextInt(), scanner.next(), scanner.next(), scanner.nextInt(),
                                    scanner.nextDouble(), scanner.nextInt()));
                        }catch (Exception e){
                            e.printStackTrace();
                        }

                        break;
                    }

                    case 4: {
                        try {
                            System.out.println("podaj dane kursu: nazwa kursu, imie i nazwisko prowadzacego, punktacja ECTS");

                            zajecia.dodaj(new Kurs(scanner.next(), scanner.next() + " " + scanner.next(), scanner.nextInt()));
                        } catch (Exception e){
                            e.printStackTrace();
                        }
                        break;
                    }

                    default: {
                        System.out.println("bledne dane");
                        break;
                    }

                }

                System.out.println("podaj co chcesz zrobic:" + "\n" +
                        "1. dodac studenta" + "\n" +
                        "2. dodac Pracownika Administracyjnego" + "\n" +
                        "3. dodac Pracownika Badawczo-Dydaktycznego" + "\n" +
                        "4. dodac kurs" + "\n" +
                        "5. zakoncz");
                pom = scanner.nextInt();
            }
        }
        else{
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new Ramka();
                }
            });
        }



//        zajecia.dodaj(new Kurs("logika", "Nyon Nguyen", 6));
//        zajecia.dodaj(new Kurs("AM", "Bartosz Frej", 8));
//        zajecia.dodaj(new Kurs("algebra", "Marian Gewert", 8));
//        zajecia.dodaj(new Kurs("PSIO", "Martin Tabakow", 8));
//        zajecia.dodaj(new Kurs("OSK", "Krzysztof Billewicz", 4));
//
//
//        a.dodaj(new Student("Jan", "Daleki", "0221828675", 19, "mezczyzna", 899563, false, true, false, true, false));
//        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
//                "nazwa", "AM")), 0);
//
//        a.dodaj(new Student("Daria", "Dalkot", "0323426275", 19, "kobieta", 129353, true, true, false, true, false));
//        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
//                "nazwa", "algebra")), 1);
//        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
//                "nazwa", "logika")), 1);
//        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
//                "nazwa", "PSIO")), 1);
//
//        a.dodaj(new Student("Anna", "Palikot", "0625828235", 20, "kobieta", 895533, false, false, true, true, false));
//        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
//                "nazwa", "logika")), 2);
//        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
//                "nazwa", "OSK")), 2);
//        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
//                "nazwa", "PSIO")), 2);
//
//
//        a.dodaj(new PracownikAdministracyjny("Anna", "Wesola", "7364753978", 32, "kobieta", "sprzatacz", 12, 2100, 5));
//        a.dodaj(new PracownikAdministracyjny("Kazimierz", "Pole", "7354755338", 58, "mezczyzna", "sprzatacz", 22, 2100, 8));
//        a.dodaj(new PracownikAdministracyjny("Antonina", "Fasolowska", "7874572530", 46, "kobieta", "kierowniczka", 17, 6100, 2));
//        a.dodaj(new PracownikAdministracyjny("Jaroslaw", "Kaczka", "7664354975", 70, "mezczyzna", "portier", 4, 3100, 1));
//
//        a.dodaj(new PracownikBadawczo_Dydaktyczny("Agata", "Osielska", "7765920365", 50, "kobieta", "Profesor Zwyczajny",
//                12, 4000, 12));
//        a.dodaj(new PracownikBadawczo_Dydaktyczny("Julia", "Oselka", "7765425235", 70, "kobieta", "sprzatacz",
//                20, 8000, 32));
//        a.dodaj(new PracownikBadawczo_Dydaktyczny("Mariusz", "Podlaski", "7365543263", 30, "mezczyzna", "Asystent",
//                5, 5000, 2));
//
//        ((Kursy) zajecia).getKursy().get(1).notifyObservers();
//
    }
}
