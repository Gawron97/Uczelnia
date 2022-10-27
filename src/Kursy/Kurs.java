package Kursy;

import Osoby.Observer;
import Osoby.Student;

import java.io.Serializable;
import java.util.ArrayList;

public class Kurs implements Serializable, Subject {

    private String nazwa_kursu;
    private String prowadzacy_imie_nazwisko;
    private int ECTS;
    private ArrayList<Observer> students;

    public Kurs(String nazwa_kursu, String prowadzacy_imie_nazwisko, int ECTS) {
        this.nazwa_kursu = nazwa_kursu;
        this.prowadzacy_imie_nazwisko = prowadzacy_imie_nazwisko;
        this.ECTS = ECTS;
        students = new ArrayList<>();
    }

    public ArrayList<Observer> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Observer> students) {
        this.students = students;
    }

    public String getNazwa_kursu() {
        return nazwa_kursu;
    }

    public void setNazwa_kursu(String nazwa_kursu) {
        this.nazwa_kursu = nazwa_kursu;
    }

    public String getProwadzacy_imie_nazwisko() {
        return prowadzacy_imie_nazwisko;
    }

    public void setProwadzacy_imie_nazwisko(String prowadzacy_imie_nazwisko) {
        this.prowadzacy_imie_nazwisko = prowadzacy_imie_nazwisko;
    }

    public int getECTS() {
        return ECTS;
    }

    public void setECTS(int ECTS) {
        this.ECTS = ECTS;
    }

    @Override
    public String toString(){
        return nazwa_kursu + " " + "{" + "\n" +
                "imie i nazwisko prowadzacego: " + prowadzacy_imie_nazwisko + "\n" +
                "punkty ECTS: " + ECTS + "\n" +
                "}" + "\n";
    }

    @Override
    public boolean equals(Object other){
        if(other == null) return false;

        if(other instanceof Kurs){
            Kurs kurs = (Kurs) other;
            if(nazwa_kursu == kurs.getNazwa_kursu() && prowadzacy_imie_nazwisko == kurs.getProwadzacy_imie_nazwisko()
                    && ECTS == kurs.getECTS()) return true;
        }

        return false;
    }

    @Override
    public void addObserver(Observer observer){
        students.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        students.remove(observer);
    }

    @Override
    public void notifyObservers(){
        for(int i=0; i<students.size(); i++){
            students.get(i).update();
        }
    }

}
