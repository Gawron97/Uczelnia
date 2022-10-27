package GUI.panele;

import Comparatory.*;
import Osoby.PracownikAdministracyjny;
import Osoby.PracownikBadawczo_Dydaktyczny;
import Osoby.Student;
import Rejestr.*;
import Detector.Detector;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Kursy.Kurs;

import static java.lang.Integer.parseInt;

public class Panel extends JPanel implements ActionListener {

    private Button wyswietl;
    private Button wyswietl_wszystko;
    private Button wyswietl_wszystkich_stud;
    private Button wyswietl_wszystkich_prac_adm;
    private Button wyswietl_wszystkich_prac_dyd;
    private Button wyswietl_kursy;
    private Button wyswietl_wszystkie_kursy;
    private Button wyswietl_studentow;
    private Button wyswietl_prac_adm;
    private Button wyswietl_prac_dyd;
    private Button wyswietl_wg_wytycznych;
    private Button wyswietl_wg_wytycznych2;
    private Button zatwierdz, zatwierdz1, zatwierdz2, zatwierdz3, zatwierdz4, zatwierdz5, zatwierdz6, zatwierdz7, zatwierdz8;
    private Button dodaj;
    private Button dodaj_student;
    private Button dodaj_prac_adm;
    private Button dodaj_prac_dyd;
    private Button dodaj_kurs;
    private Button dodaj_kurs_do_student;
    private Button usun;
    private Button usun_student;
    private Button usun_prac_adm;
    private Button usun_prac_dyd;
    private Button usun_kurs;
    private Button sort;
    private Button sort_nazwisko;
    private Button sort_nazwisko_imie;
    private Button sort_nazwisko_wiek;
    private Button sort_nazwiskoProwadzacego;
    private Button sort_ECTS;
    private TextField text, text2;
    private Rejestr a;
    private Rejestr zajecia;
    private Class<?> typ;
    private Button usun_pow;


    public Panel(){

        setVisible(true);

        //deklaracja danych-------------------------------------------------
        Detector detector = new Detector();
        zajecia = new Kursy();
        a = new Lista();


        /*
        zajecia.dodaj(new Kurs("logika", "Nyon Nguyen", 6));
        zajecia.dodaj(new Kurs("AM", "Bartosz Frej", 8));
        zajecia.dodaj(new Kurs("algebra", "Marian Gewert", 8));
        zajecia.dodaj(new Kurs("PSIO", "Martin Tabakow", 8));
        zajecia.dodaj(new Kurs("OSK", "Krzysztof Billewicz", 4));


        a.dodaj(new Student("Jan", "Daleki", "0221828675", 19, "mezczyzna", 899563, false, true, false, true, false));
        a.dodaj(new Student("Jn", "Dalei", "0221828675", 19, "mezcyzna", 899563, false, true, false, true, false));
        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
                "nazwa", "AM")), 0);

        a.dodaj(new Student("Daria", "Dalkot", "0323426275", 19, "kobieta", 129353, true, true, false, true, false));
        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
                "nazwa", "algebra")), 1);
        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
                "nazwa", "logika")), 1);
        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
                "nazwa", "PSIO")), 1);

        a.dodaj(new Student("Anna", "Palikot", "0625828235", 20, "kobieta", 895533, false, false, true, true, false));
        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
                "nazwa", "logika")), 2);
        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
                "nazwa", "OSK")), 2);
        ((Lista)a).dodajKursy(((Kursy) zajecia).zwrocPoIndeksach(detector.wyszukajKurs(((Kursy) zajecia).getKursy(),
                "nazwa", "PSIO")), 2);


        a.dodaj(new PracownikAdministracyjny("Anna", "Wesola", "7364753978", 32, "kobieta", "sprzatacz", 12, 2100, 5));
        a.dodaj(new PracownikAdministracyjny("Ana", "Wesla", "7364753978", 32, "kobeta", "sprzatacz", 12, 2100, 5));
        a.dodaj(new PracownikAdministracyjny("Kazimierz", "Pole", "7354755338", 58, "mezczyzna", "sprzatacz", 22, 2100, 8));
        a.dodaj(new PracownikAdministracyjny("Antonina", "Fasolowska", "7874572530", 46, "kobieta", "kierowniczka", 17, 6100, 2));
        a.dodaj(new PracownikAdministracyjny("Jaroslaw", "Kaczka", "7664354975", 70, "mezczyzna", "portier", 4, 3100, 1));

        a.dodaj(new PracownikBadawczo_Dydaktyczny("Agata", "Osielska", "7765920365", 50, "kobieta", "Profesor Zwyczajny",
                12, 4000, 12));
        a.dodaj(new PracownikBadawczo_Dydaktyczny("Julia", "Oselka", "7765425235", 70, "kobieta", "sprzatacz",
                20, 8000, 32));
        a.dodaj(new PracownikBadawczo_Dydaktyczny("Mariusz", "Podlaski", "7365543263", 30, "mezczyzna", "Asystent",
                5, 5000, 2));

         */


        //guziki************************************************************
        wyswietl = new Button("menu opcji wyswietlania");
        wyswietl_wszystkie_kursy = new Button("menu wyswietlania kursow");
        wyswietl_studentow = new Button("menu wyswietlania studentow");
        wyswietl_wszystko = new Button("wyswietl wszystkich");
        wyswietl_wg_wytycznych = new Button("wyswietl wg. wytycznych");
        wyswietl_wg_wytycznych2 = new Button("wyswietl wg. wytycznych");
        wyswietl_kursy = new Button("menu wyswietlania kursow");
        wyswietl_wszystkich_stud = new Button("wyswietl wszystkich studentow");
        wyswietl_prac_adm = new Button("menu wyswietlania pracownikow administracyjnych");
        wyswietl_prac_dyd = new Button("menu wyswietlania pracownikow dydaktycznych");
        wyswietl_wszystkich_prac_adm = new Button("wyswietl wszystkich pracownikow administracyjnych");
        wyswietl_wszystkich_prac_dyd = new Button("wyswietl wszystkich pracownikow dydaktycznych");
        zatwierdz = new Button("zatwierdz");
        zatwierdz1 = new Button("zatwierdz");

        dodaj = new Button("menu opcji dodawania");
        dodaj_student = new Button("dodaj studenta");
        dodaj_prac_adm = new Button("dodaj pracownika administracyjnego");
        dodaj_prac_dyd = new Button("dodaj pracownika dydaktycznego");
        dodaj_kurs = new Button("dodaj kurs");
        dodaj_kurs_do_student = new Button("dodaj kurs do studenta");
        zatwierdz2 = new Button("zatwierdz");
        zatwierdz3 = new Button("zatwierdz");
        zatwierdz4 = new Button("zatwierdz");
        zatwierdz5 = new Button("zatwierdz");
        zatwierdz6 = new Button("zatwierdz");

        usun = new Button("menu opcji usuwania");
        usun_student = new Button("usun studenta");
        usun_prac_adm = new Button("usun pracownika administracyjnego");
        usun_prac_dyd = new Button("usun pracownika dydaktycznego");
        usun_kurs = new Button("usun kurs");
        zatwierdz7 = new Button("zatwierdz");
        zatwierdz8 = new Button("zatwierdz");

        sort = new Button("menu opcji sortowania");
        sort_nazwisko_wiek = new Button("sortuj po nazwisku i wieku");
        sort_nazwisko = new Button("sortuj po nazwisku");
        sort_nazwisko_imie = new Button("sortuj po nazwisku i imieniu");
        sort_ECTS = new Button("sortuj po pkt ECTS");
        sort_nazwiskoProwadzacego = new Button("sortuj po nazwisku prowadzacego");
        usun_pow = new Button("usun powtarzajace sie osoby");

        add(wyswietl);
        add(wyswietl_studentow);
        add(wyswietl_wszystkie_kursy);
        add(wyswietl_wg_wytycznych);
        add(wyswietl_wg_wytycznych2);
        add(wyswietl_wszystko);
        add(wyswietl_kursy);
        add(wyswietl_wszystkich_stud);
        add(wyswietl_prac_adm);
        add(wyswietl_prac_dyd);
        add(wyswietl_wszystkich_prac_adm);
        add(wyswietl_wszystkich_prac_dyd);
        add(zatwierdz);
        add(zatwierdz1);

        add(dodaj);
        add(dodaj_student);
        add(dodaj_prac_adm);
        add(dodaj_prac_dyd);
        add(dodaj_kurs);
        add(dodaj_kurs_do_student);
        add(zatwierdz2);
        add(zatwierdz3);
        add(zatwierdz4);
        add(zatwierdz5);
        add(zatwierdz6);

        add(usun);
        add(usun_student);
        add(usun_prac_adm);
        add(usun_prac_dyd);
        add(usun_kurs);
        add(zatwierdz7);
        add(zatwierdz8);

        add(sort);
        add(sort_nazwisko_wiek);
        add(sort_ECTS);
        add(sort_nazwisko);
        add(sort_nazwisko_imie);
        add(sort_nazwiskoProwadzacego);

        add(usun_pow);

        wyswietl.addActionListener(this);
        wyswietl_studentow.addActionListener(this);
        wyswietl_wszystkie_kursy.addActionListener(this);
        wyswietl_wszystko.addActionListener(this);
        wyswietl_wg_wytycznych.addActionListener(this);
        wyswietl_wg_wytycznych2.addActionListener(this);
        wyswietl_kursy.addActionListener(this);
        wyswietl_wszystkich_stud.addActionListener(this);
        wyswietl_prac_adm.addActionListener(this);
        wyswietl_prac_dyd.addActionListener(this);
        wyswietl_wszystkich_prac_adm.addActionListener(this);
        wyswietl_wszystkich_prac_dyd.addActionListener(this);
        zatwierdz.addActionListener(this);
        zatwierdz1.addActionListener(this);

        dodaj.addActionListener(this);
        dodaj_student.addActionListener(this);
        dodaj_prac_adm.addActionListener(this);
        dodaj_prac_dyd.addActionListener(this);
        dodaj_kurs.addActionListener(this);
        dodaj_kurs_do_student.addActionListener(this);
        zatwierdz2.addActionListener(this);
        zatwierdz3.addActionListener(this);
        zatwierdz4.addActionListener(this);
        zatwierdz5.addActionListener(this);
        zatwierdz6.addActionListener(this);

        usun.addActionListener(this);
        usun_student.addActionListener(this);
        usun_prac_adm.addActionListener(this);
        usun_prac_dyd.addActionListener(this);
        usun_kurs.addActionListener(this);
        zatwierdz7.addActionListener(this);
        zatwierdz8.addActionListener(this);

        sort.addActionListener(this);
        sort_nazwiskoProwadzacego.addActionListener(this);
        sort_nazwisko_wiek.addActionListener(this);
        sort_nazwisko.addActionListener(this);
        sort_ECTS.addActionListener(this);
        sort_nazwisko_imie.addActionListener(this);

        usun_pow.addActionListener(this);

        wyswietl.setVisible(true);
        wyswietl_wszystko.setVisible(false);
        wyswietl_wszystkie_kursy.setVisible(false);
        wyswietl_studentow.setVisible(false);
        wyswietl_wg_wytycznych.setVisible(false);
        wyswietl_wg_wytycznych2.setVisible(false);
        wyswietl_kursy.setVisible(false);
        wyswietl_wszystkich_stud.setVisible(false);
        wyswietl_prac_dyd.setVisible(false);
        wyswietl_prac_adm.setVisible(false);
        wyswietl_wszystkich_prac_adm.setVisible(false);
        wyswietl_wszystkich_prac_dyd.setVisible(false);
        zatwierdz.setVisible(false);
        zatwierdz1.setVisible(false);

        dodaj.setVisible(true);
        dodaj_student.setVisible(false);
        dodaj_prac_adm.setVisible(false);
        dodaj_prac_dyd.setVisible(false);
        dodaj_kurs.setVisible(false);
        dodaj_kurs_do_student.setVisible(false);
        zatwierdz2.setVisible(false);
        zatwierdz3.setVisible(false);
        zatwierdz4.setVisible(false);
        zatwierdz5.setVisible(false);
        zatwierdz6.setVisible(false);

        usun.setVisible(true);
        usun_student.setVisible(false);
        usun_prac_adm.setVisible(false);
        usun_prac_dyd.setVisible(false);
        usun_kurs.setVisible(false);
        zatwierdz7.setVisible(false);
        zatwierdz8.setVisible(false);

        sort.setVisible(true);
        sort_nazwisko_wiek.setVisible(false);
        sort_nazwisko.setVisible(false);
        sort_ECTS.setVisible(false);
        sort_nazwisko_imie.setVisible(false);
        sort_nazwiskoProwadzacego.setVisible(false);

        usun_pow.setVisible(true);

        wyswietl.setSize(200, 40);
        wyswietl.setLocation(0, 0);
        wyswietl_studentow.setSize(200, 40);
        wyswietl_studentow.setLocation(0, 40);
        wyswietl_kursy.setSize(200, 40);
        wyswietl_kursy.setLocation(200, 40);
        wyswietl_wszystko.setSize(200, 40);
        wyswietl_wszystko.setLocation(400, 40);
        wyswietl_prac_adm.setLocation(0, 80);
        wyswietl_prac_adm.setSize(400, 40);
        wyswietl_prac_dyd.setLocation(400, 80);
        wyswietl_prac_dyd.setSize(400, 40);
        wyswietl_wszystkich_prac_adm.setLocation(200, 80);
        wyswietl_wszystkich_prac_adm.setSize(400, 40);
        wyswietl_wszystkich_prac_dyd.setLocation(200, 80);
        wyswietl_wszystkich_prac_dyd.setSize(400, 40);
        wyswietl_wg_wytycznych.setSize(200, 40);
        wyswietl_wg_wytycznych.setLocation(0, 80);
        wyswietl_wszystkich_stud.setSize(200, 40);
        wyswietl_wszystkich_stud.setLocation(200, 80);
        wyswietl_wg_wytycznych2.setLocation(0, 80);
        wyswietl_wg_wytycznych2.setSize(200, 40);
        zatwierdz.setSize(200, 40);
        zatwierdz.setLocation(600, 0);
        zatwierdz1.setSize(200, 40);
        zatwierdz1.setLocation(600, 0);

        dodaj.setLocation(200, 0);
        dodaj.setSize(200, 40);
        dodaj_student.setLocation(0, 40);
        dodaj_student.setSize(200, 40);
        dodaj_prac_adm.setLocation(200, 40);
        dodaj_prac_adm.setSize(200, 40);
        dodaj_prac_dyd.setLocation(400, 40);
        dodaj_prac_dyd.setSize(200, 40);
        dodaj_kurs.setLocation(600, 40);
        dodaj_kurs.setSize(200, 40);
        dodaj_kurs_do_student.setLocation(800, 40);
        dodaj_kurs_do_student.setSize(200, 40);
        zatwierdz2.setSize(200, 40);
        zatwierdz2.setLocation(600, 0);
        zatwierdz3.setSize(200, 40);
        zatwierdz3.setLocation(600, 0);
        zatwierdz4.setSize(200, 40);
        zatwierdz4.setLocation(600, 0);
        zatwierdz5.setSize(200, 40);
        zatwierdz5.setLocation(600, 0);
        zatwierdz6.setSize(200, 40);
        zatwierdz6.setLocation(600, 0);

        usun.setLocation(400, 0);
        usun.setSize(200, 40);
        usun_student.setLocation(0, 40);
        usun_student.setSize(200, 40);
        usun_prac_adm.setLocation(200, 40);
        usun_prac_adm.setSize(200, 40);
        usun_prac_dyd.setLocation(400, 40);
        usun_prac_dyd.setSize(200, 40);
        zatwierdz7.setSize(200, 40);
        zatwierdz7.setLocation(600, 0);
        zatwierdz8.setSize(200, 40);
        zatwierdz8.setLocation(600, 0);

        sort.setLocation(600, 0);
        sort.setSize(200, 40);
        sort_nazwisko.setLocation(0, 40);
        sort_nazwisko.setSize(200, 40);
        sort_nazwisko_imie.setLocation(200, 40);
        sort_nazwisko_imie.setSize(200, 40);
        sort_nazwisko_wiek.setLocation(400, 40);
        sort_nazwisko_wiek.setSize(200, 40);
        sort_nazwiskoProwadzacego.setLocation(600, 40);
        sort_nazwiskoProwadzacego.setSize(200, 40);
        sort_ECTS.setLocation(800, 40);
        sort_ECTS.setSize(200, 40);


        //teksty*************************************************
        text = new TextField();
        add(text);
        text.setSize(400, 80);
        text.setLocation(0, 150);
        text.setVisible(false);

        text2 = new TextField();
        add(text2);
        text2.setVisible(false);
        text2.setLocation(0, 110);
        text2.setSize(1000, 40);
        text2.setEditable(false);

    }

    public void zapisz(){
        ((Lista) a).zapisz();
    }

    public void odczyt(){
        ((Lista) a).odczyt();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();

        if(source == wyswietl){
            wyswietl.setVisible(false);
            dodaj.setVisible(false);
            usun.setVisible(false);
            sort.setVisible(false);
            wyswietl_wszystko.setVisible(true);
            wyswietl_studentow.setVisible(true);
            wyswietl_kursy.setVisible(true);
            wyswietl_prac_dyd.setVisible(true);
            wyswietl_prac_adm.setVisible(true);
        }
        if(source == wyswietl_wszystko){
            wyswietl_studentow.setVisible(false);
            wyswietl_kursy.setVisible(false);
            wyswietl_wszystko.setVisible(false);
            wyswietl_prac_adm.setVisible(false);
            wyswietl_prac_dyd.setVisible(false);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            dodaj.setVisible(true);
            sort.setVisible(true);
            a.wyswietl();
        }
        if(source == wyswietl_kursy){
            wyswietl_kursy.setVisible(false);
            wyswietl_wszystko.setVisible(false);
            wyswietl_studentow.setVisible(false);
            wyswietl_prac_dyd.setVisible(false);
            wyswietl_prac_adm.setVisible(false);
            wyswietl_wg_wytycznych2.setVisible(true);
            wyswietl_wszystkie_kursy.setVisible(true);
        }
        if(source == wyswietl_wszystkie_kursy){
            wyswietl_wszystkie_kursy.setVisible(false);
            wyswietl_wg_wytycznych2.setVisible(false);
            zajecia.wyswietl();
            wyswietl.setVisible(true);
            dodaj.setVisible(true);
            usun.setVisible(true);
            sort.setVisible(true);
        }
        if(source == wyswietl_wg_wytycznych2){
            wyswietl_wg_wytycznych2.setVisible(false);
            wyswietl_wszystkie_kursy.setVisible(false);
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj: po czym i wartosc");
            zatwierdz1.setVisible(true);
        }
        if(source == zatwierdz1){
            String [] x = text.getText().split(" ");
            if(x.length > 2){
                x[0] += " " + x[1];
                x[1] = x[2];
            }
            ((Kursy) zajecia).wyswietlDaneKursy(x[0], x[1]);
            zatwierdz1.setVisible(false);
            text2.setVisible(false);
            text.setVisible(false);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            dodaj.setVisible(true);
            sort.setVisible(true);
        }
        if(source == wyswietl_studentow){
            wyswietl_kursy.setVisible(false);
            wyswietl_wszystko.setVisible(false);
            wyswietl_studentow.setVisible(false);
            wyswietl_prac_dyd.setVisible(false);
            wyswietl_prac_adm.setVisible(false);
            wyswietl_wg_wytycznych.setVisible(true);
            wyswietl_wszystkich_stud.setVisible(true);
            typ = Student.class;
        }
        if(source == wyswietl_wszystkich_stud){
            wyswietl_wg_wytycznych.setVisible(false);
            wyswietl_wszystkich_stud.setVisible(false);
            ((Lista) a).wyswietlDanyTypOsoby(Student.class);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            dodaj.setVisible(true);
            sort.setVisible(true);
        }
        if(source == wyswietl_wg_wytycznych){

            wyswietl_wszystkich_stud.setVisible(false);
            wyswietl_wg_wytycznych.setVisible(false);
            wyswietl_wszystkich_prac_adm.setVisible(false);
            wyswietl_wszystkich_prac_dyd.setVisible(false);
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj: po czym i wartosc");
            zatwierdz.setVisible(true);
        }
        if(source == wyswietl_prac_adm){
            wyswietl_kursy.setVisible(false);
            wyswietl_wszystko.setVisible(false);
            wyswietl_studentow.setVisible(false);
            wyswietl_prac_dyd.setVisible(false);
            wyswietl_prac_adm.setVisible(false);
            wyswietl_wg_wytycznych.setVisible(true);
            wyswietl_wszystkich_prac_adm.setVisible(true);
            typ = PracownikAdministracyjny.class;
        }
        if(source == wyswietl_prac_dyd){
            wyswietl_kursy.setVisible(false);
            wyswietl_wszystko.setVisible(false);
            wyswietl_studentow.setVisible(false);
            wyswietl_prac_dyd.setVisible(false);
            wyswietl_prac_adm.setVisible(false);
            wyswietl_wg_wytycznych.setVisible(true);
            wyswietl_wszystkich_prac_dyd.setVisible(true);
            typ = PracownikBadawczo_Dydaktyczny.class;
        }
        if(source == wyswietl_wszystkich_prac_adm){
            wyswietl_wg_wytycznych.setVisible(false);
            wyswietl_wszystkich_prac_adm.setVisible(false);
            ((Lista) a).wyswietlDanyTypOsoby(PracownikAdministracyjny.class);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            dodaj.setVisible(true);
            sort.setVisible(true);
        }
        if(source == wyswietl_wszystkich_prac_dyd){
            wyswietl_wg_wytycznych.setVisible(false);
            wyswietl_wszystkich_prac_dyd.setVisible(false);
            ((Lista) a).wyswietlDanyTypOsoby(PracownikBadawczo_Dydaktyczny.class);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            dodaj.setVisible(true);
            sort.setVisible(true);

        }
        if(source == zatwierdz){
            String [] x = text.getText().split(" ");
            if(x.length > 2){
                x[0] += " " + x[1];
                x[1] = x[2];
            }
            ((Lista) a).wyswietlDaneOsoby(typ, x[0], x[1]);
            zatwierdz.setVisible(false);
            text.setVisible(false);
            text2.setVisible(false);
            wyswietl.setVisible(true);
            dodaj.setVisible(true);
            usun.setVisible(true);
            sort.setVisible(true);
        }

        if(source == dodaj){
            wyswietl.setVisible(false);
            dodaj.setVisible(false);
            usun.setVisible(false);
            sort.setVisible(false);
            dodaj_student.setVisible(true);
            dodaj_prac_adm.setVisible(true);
            dodaj_prac_dyd.setVisible(true);
            dodaj_kurs.setVisible(true);
            dodaj_kurs_do_student.setVisible(true);
        }
        if(source == dodaj_student){
            dodaj_student.setVisible(false);
            dodaj_prac_adm.setVisible(false);
            dodaj_prac_dyd.setVisible(false);
            dodaj_kurs.setVisible(false);
            dodaj_kurs_do_student.setVisible(false);
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj dane studenta: imie, nazwisko, pesel, wiek, plec, numer indeksu, " +
                    "czy uczestnik ERASMUS, czy I-stopien, czy II-stopien, czy studia stacjonarne, " +
                    "czy studia niestacjonarne");
            zatwierdz2.setVisible(true);

        }
        if(source == dodaj_prac_adm){
            dodaj_student.setVisible(false);
            dodaj_prac_adm.setVisible(false);
            dodaj_prac_dyd.setVisible(false);
            dodaj_kurs.setVisible(false);
            dodaj_kurs_do_student.setVisible(false);
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj dane pracownika administracyjnego: imie, nazwisko, pesel, wiek," +
                    " plec, stanowisko, staz pracy, pensja, liczba nadgodzin");
            zatwierdz3.setVisible(true);
        }
        if(source == dodaj_prac_dyd){
            dodaj_student.setVisible(false);
            dodaj_prac_adm.setVisible(false);
            dodaj_prac_dyd.setVisible(false);
            dodaj_kurs.setVisible(false);
            dodaj_kurs_do_student.setVisible(false);
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj dane pracownika badawczo dydaktycznego: imie, nazwisko, pesel, wiek, " +
                    "plec, stanowisko, staz pracy, pensja, punktacja z dorobku naukowego");
            zatwierdz4.setVisible(true);
        }
        if(source == dodaj_kurs){
            dodaj_student.setVisible(false);
            dodaj_prac_adm.setVisible(false);
            dodaj_prac_dyd.setVisible(false);
            dodaj_kurs.setVisible(false);
            dodaj_kurs_do_student.setVisible(false);
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj dane kursu: nazwa kursu, imie i nazwisko prowadzacego, punktacja ECTS");
            zatwierdz5.setVisible(true);
        }
        if(source == dodaj_kurs_do_student){
            dodaj_student.setVisible(false);
            dodaj_prac_adm.setVisible(false);
            dodaj_prac_dyd.setVisible(false);
            dodaj_kurs.setVisible(false);
            dodaj_kurs_do_student.setVisible(false);
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj dane kursu: po czym i wartosc, oraz dane studenta: po czym i wartosc");
            zatwierdz6.setVisible(true);
        }
        if(source == zatwierdz2){
            String [] x = text.getText().split(" ");

            try {
                a.dodaj(new Student(x[0], x[1], x[2], Integer.parseInt(x[3]), x[4], Integer.parseInt(x[5]),
                        Boolean.parseBoolean(x[6]), Boolean.parseBoolean(x[7]), Boolean.parseBoolean(x[8]),
                        Boolean.parseBoolean(x[9]), Boolean.parseBoolean(x[10])));
                System.out.println("dodano studenta");
            }catch (Exception ex){
                System.out.println("zle dane");
            }
            text.setVisible(false);
            text2.setVisible(false);
            zatwierdz2.setVisible(false);
            dodaj.setVisible(true);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            sort.setVisible(true);
        }
        if(source == zatwierdz3){
            String [] x = text.getText().split(" ");
            try {
                a.dodaj(new PracownikAdministracyjny(x[0], x[1], x[2], Integer.parseInt(x[3]), x[4], x[5],
                        Integer.parseInt(x[6]), Double.parseDouble(x[7]), Integer.parseInt(x[8])));
                System.out.println("dodano Pracownika Administracyjnego");
            }catch (Exception ex){
                System.out.println("bledne dane");
            }
            text.setVisible(false);
            text2.setVisible(false);
            zatwierdz3.setVisible(false);
            dodaj.setVisible(true);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            sort.setVisible(true);
        }
        if(source == zatwierdz4){
            String [] x = text.getText().split(" ");
            try {
                a.dodaj(new PracownikBadawczo_Dydaktyczny(x[0], x[1], x[2], Integer.parseInt(x[3]), x[4], x[5],
                        Integer.parseInt(x[6]), Double.parseDouble(x[7]), Integer.parseInt(x[8])));
                System.out.println("dodano Pracownika Badawczo-dydaktycznego");
            }catch (Exception ex){
                System.out.println("bledne dane");
            }
            text.setVisible(false);
            text2.setVisible(false);
            zatwierdz4.setVisible(false);
            dodaj.setVisible(true);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            sort.setVisible(true);
        }
        if(source == zatwierdz5){
            String [] x = text.getText().split(" ");
            x[1] += x[2];
            try {
                zajecia.dodaj(new Kurs(x[0], x[1], Integer.parseInt(x[3])));
                System.out.println("dodano kurs");
            }catch (Exception ex){
                System.out.println("bledne dane");
            }
            text.setVisible(false);
            text2.setVisible(false);
            zatwierdz5.setVisible(false);
            dodaj.setVisible(true);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            sort.setVisible(true);
        }
        if(source == zatwierdz6){
            String [] x = text.getText().split(" ");
            if(x.length > 4){
                x[2] += " " + x[3];
                x[3] = x[4];
            }
            try {
                ((Lista) a).dodajKursyWgWytycznych(((Kursy) zajecia).getKursy(), x[0], x[1], x[2], x[3]);
                System.out.println("dodano kurs do studenta");
            }catch (Exception ex){
                System.out.println("bledne dane");
            }
            text.setVisible(false);
            text2.setVisible(false);
            zatwierdz6.setVisible(false);
            dodaj.setVisible(true);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            sort.setVisible(true);
        }

        if(source == usun){
            dodaj.setVisible(false);
            wyswietl.setVisible(false);
            usun.setVisible(false);
            sort.setVisible(false);
            usun_student.setVisible(true);
            usun_prac_adm.setVisible(true);
            usun_prac_dyd.setVisible(true);
            usun_kurs.setVisible(true);
        }
        if(source == usun_student){
            usun_student.setVisible(false);
            usun_prac_adm.setVisible(false);
            usun_prac_dyd.setVisible(false);
            usun_kurs.setVisible(false);
            typ = Student.class;
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj po czym i wartosc");
            zatwierdz7.setVisible(true);
        }
        if(source == usun_prac_adm){
            usun_student.setVisible(false);
            usun_prac_adm.setVisible(false);
            usun_prac_dyd.setVisible(false);
            usun_kurs.setVisible(false);
            typ = PracownikAdministracyjny.class;
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj po czym i wartosc");
            zatwierdz7.setVisible(true);
        }
        if(source == usun_prac_dyd){
            usun_student.setVisible(false);
            usun_prac_adm.setVisible(false);
            usun_prac_dyd.setVisible(false);
            usun_kurs.setVisible(false);
            typ = PracownikBadawczo_Dydaktyczny.class;
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj po czym i wartosc");
            zatwierdz7.setVisible(true);
        }
        if(source == usun_kurs){
            usun_student.setVisible(false);
            usun_prac_adm.setVisible(false);
            usun_prac_dyd.setVisible(false);
            usun_kurs.setVisible(false);
            text.setVisible(true);
            text2.setVisible(true);
            text2.setText("podaj po czym i wartosc");
            zatwierdz8.setVisible(true);
        }
        if(source == zatwierdz7){
            String [] x = text.getText().split(" ");
            if(x.length > 2){
                x[0] += " " + x[1];
                x[1] = x[2];
            }
            try {
                ((Lista) a).usun(typ, x[0], x[1]);
                System.out.println("usunieto osobe");
            }catch (Exception ex){
                System.out.println("bledne dane");
            }
            zatwierdz7.setVisible(false);
            text.setVisible(false);
            text2.setVisible(false);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            dodaj.setVisible(true);
            sort.setVisible(true);
        }
        if(source == zatwierdz8){
            String [] x = text.getText().split(" ");
            try {
                ((Kursy) zajecia).usun(x[0], x[1]);
                System.out.println("usunieto kurs");
            }catch (Exception ex){
                System.out.println("bledne dane");
            }
            zatwierdz8.setVisible(false);
            text.setVisible(false);
            text2.setVisible(false);
            wyswietl.setVisible(true);
            usun.setVisible(true);
            dodaj.setVisible(true);
            sort.setVisible(true);
        }

        if(source == sort){
            usun.setVisible(false);
            wyswietl.setVisible(false);
            dodaj.setVisible(false);
            sort.setVisible(false);
            sort_nazwisko.setVisible(true);
            sort_nazwisko_wiek.setVisible(true);
            sort_nazwisko_imie.setVisible(true);
            sort_ECTS.setVisible(true);
            sort_nazwiskoProwadzacego.setVisible(true);
        }
        if(source == sort_nazwisko){
            sort_nazwisko.setVisible(false);
            sort_nazwisko_imie.setVisible(false);
            sort_nazwisko_wiek.setVisible(false);
            sort_nazwiskoProwadzacego.setVisible(false);
            sort_ECTS.setVisible(false);
            a.sort(new CompareOsobaPoNazwisku());
            dodaj.setVisible(true);
            usun.setVisible(true);
            wyswietl.setVisible(true);
            sort.setVisible(true);
            System.out.println("posortowano wg. nazwiska");
        }
        if(source == sort_nazwisko_imie){
            sort_nazwisko.setVisible(false);
            sort_nazwisko_imie.setVisible(false);
            sort_nazwisko_wiek.setVisible(false);
            sort_nazwiskoProwadzacego.setVisible(false);
            sort_ECTS.setVisible(false);
            a.sort(new CompareOsobaPoNazwiskuImieniu());
            dodaj.setVisible(true);
            usun.setVisible(true);
            wyswietl.setVisible(true);
            sort.setVisible(true);
            System.out.println("posortowano wg. nazwiska i imienia");
        }
        if(source == sort_nazwisko_wiek){
            sort_nazwisko.setVisible(false);
            sort_nazwisko_imie.setVisible(false);
            sort_nazwisko_wiek.setVisible(false);
            sort_nazwiskoProwadzacego.setVisible(false);
            sort_ECTS.setVisible(false);
            a.sort(new CompareOsobaPoNazwiskuWieku());
            dodaj.setVisible(true);
            usun.setVisible(true);
            wyswietl.setVisible(true);
            sort.setVisible(true);
            System.out.println("posortowano wg. nazwiska i wieku");
        }
        if(source == sort_ECTS){
            sort_nazwisko.setVisible(false);
            sort_nazwisko_imie.setVisible(false);
            sort_nazwisko_wiek.setVisible(false);
            sort_nazwiskoProwadzacego.setVisible(false);
            sort_ECTS.setVisible(false);
            a.sort(new CompareKursyPoECTS());
            dodaj.setVisible(true);
            usun.setVisible(true);
            wyswietl.setVisible(true);
            sort.setVisible(true);
            System.out.println("posortowano wg. pkt. ECTS");
        }
        if(source == sort_nazwiskoProwadzacego){
            sort_nazwisko.setVisible(false);
            sort_nazwisko_imie.setVisible(false);
            sort_nazwisko_wiek.setVisible(false);
            sort_nazwiskoProwadzacego.setVisible(false);
            sort_ECTS.setVisible(false);
            a.sort(new CompareKursyPoNazwiskuProwadzacego());
            dodaj.setVisible(true);
            usun.setVisible(true);
            wyswietl.setVisible(true);
            sort.setVisible(true);
            System.out.println("posortowano wg. nazwiska prowadzacego");
        }

        if(source == usun_pow){
            ((Lista) a).usunPowtarzajace();
        }

    }

}
