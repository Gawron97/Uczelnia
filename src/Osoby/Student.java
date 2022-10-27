package Osoby;
import Kursy.Kurs;
import Kursy.Subject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class Student extends Osoba implements Serializable, Observer {

    private int nr_indeksu;
    private ArrayList<Kurs> lista_kursow;
    private boolean uczestnik_ERASMUS;
    private boolean I_stopien;
    private boolean II_stopien;
    private boolean studia_stacjonarne;
    private boolean studia_niestacjonarne;

    public Student(String imie, String nazwisko, String pesel, int wiek, String plec, int nr_indeksu,
                   boolean uczestnik_ERASMUS, boolean I_stopien, boolean II_stopien, boolean studia_stacjonarne,
                   boolean studia_niestacjonarne) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.nr_indeksu = nr_indeksu;
        this.uczestnik_ERASMUS = uczestnik_ERASMUS;
        this.I_stopien = I_stopien;
        this.II_stopien = II_stopien;
        this.studia_stacjonarne = studia_stacjonarne;
        this.studia_niestacjonarne = studia_niestacjonarne;
        lista_kursow = new ArrayList<>();
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public ArrayList<Kurs> getLista_kursow() {
        return lista_kursow;
    }

    public void setLista_kursow(ArrayList<Kurs> lista_kursow) {
        this.lista_kursow = lista_kursow;
    }

    public boolean isUczestnik_ERASMUS() {
        return uczestnik_ERASMUS;
    }

    public void setUczestnik_ERASMUS(boolean uczestnik_ERASMUS) {
        this.uczestnik_ERASMUS = uczestnik_ERASMUS;
    }

    public boolean isI_stopien() {
        return I_stopien;
    }

    public void setI_stopien(boolean i_stopien) {
        I_stopien = i_stopien;
    }

    public boolean isII_stopien() {
        return II_stopien;
    }

    public void setII_stopien(boolean II_stopien) {
        this.II_stopien = II_stopien;
    }

    public boolean isStudia_stacjonarne() {
        return studia_stacjonarne;
    }

    public void setStudia_stacjonarne(boolean studia_stacjonarne) {
        this.studia_stacjonarne = studia_stacjonarne;
    }

    public boolean isStudia_niestacjonarne() {
        return studia_niestacjonarne;
    }

    public void setStudia_niestacjonarne(boolean studia_niestacjonarne) {
        this.studia_niestacjonarne = studia_niestacjonarne;
    }

    @Override
    public String toString(){
        return "{" + "\n" +
                "Student" + "\n" +
                super.toString() +
                "numer indeksu: " + nr_indeksu + "\n" +
                "lista kursow: " + lista_kursow.toString() + "\n" +
                "czy uczesnik ERASUMUS? " + uczestnik_ERASMUS + "\n" +
                "uczen I-stopnia? " + I_stopien + "\n" +
                "uczen II-stopnia? " + II_stopien + "\n" +
                "studia stacjonarne? " + studia_stacjonarne + "\n" +
                "studia niestacjonarne? " + studia_niestacjonarne + "\n" +
                "}" + "\n";
    }

    public void dodajKurs(Kurs kurs){
        lista_kursow.add(kurs);
        kurs.addObserver(this);
    }

    public void usunKurs(Kurs kurs){
        lista_kursow.add(kurs);
        kurs.removeObserver(this);
    }

    @Override
    public boolean equals(Object other){
        if(other == null) return false;
        if(other instanceof Student){
            Student student = ((Student) other);
            if(student.getNr_indeksu() == nr_indeksu)
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nr_indeksu);
    }

    @Override
    public void update(){
        System.out.println(this);
    }
}
