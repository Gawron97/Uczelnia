package Rejestr;

import Kursy.Kurs;
import Detector.Detector;
import Osoby.Osoba;
import Osoby.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;


public class Lista implements Rejestr, Serializable {

    private ArrayList<Osoba> list = new ArrayList<>();
    private static final long serialVersionUID = 6433858223774886977L;

    @Override
    public void dodaj(Object osoba){
        list.add(((Osoba)osoba));
    }

    @Override
    public void dodaj(ArrayList<Object> a){
        for(int i=0; i<a.size(); i++){
            list.add((Osoba) a.get(i));
        }
    }

    @Override
    public void usun(Object osoba){
        list.remove(((Osoba) osoba));
    }

    @Override
    public void usun(int index){
        list.remove(index);
    }

    @Override
    public void usun(ArrayList<Integer> a){
        for(int i=a.size()-1; i>=0; i--){
            list.remove(((int) a.get(i)));
        }
    }

    public void usun(Class<?> typ, String poCzym, Object cos){
        Detector detector = new Detector();

        usun(detector.wyszukaj(list, typ, poCzym, cos));
    }

    public ArrayList<Osoba> getList() {
        return list;
    }

    public void setList(ArrayList<Osoba> list) {
        this.list = list;
    }

    @Override
    public void wyswietl(){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    @Override
    public void wyswietlPoIndeksach(ArrayList<Integer> a){
        for(int i=0; i<a.size(); i++){
            System.out.println(list.get(((int) a.get(i))));
        }
    }

    public void wyswietlDaneOsoby(Class<?> typ, String poCzym, Object cos){

        Detector detector = new Detector();
        ArrayList<Integer> pom = new ArrayList<>();

        pom = detector.wyszukaj(list, typ, poCzym, cos);

        for(int i=0; i<pom.size(); i++){
            System.out.println(list.get(pom.get(i)));
        }

    }

    public void wyswietlDanyTypOsoby(Class<?> typ){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getClass().equals(typ))
                System.out.println(list.get(i));
        }
    }

    public ArrayList<Osoba> zwrocPoIndeksach(ArrayList<Integer> a){
        ArrayList<Osoba> pom = new ArrayList<>();
        for(int i=0; i<a.size(); i++){
            pom.add(list.get(a.get(i)));
        }

        return pom;
    }

    public ArrayList<Osoba> zwrocOkreslony(Class<?> typ, String poCzym, Object cos){
        ArrayList<Integer> pom = new ArrayList<>();
        Detector detector = new Detector();

        pom = detector.wyszukaj(list, typ, poCzym, cos);
        ArrayList<Osoba> lista = new ArrayList<>();

        for(int i=0; i<pom.size(); i++){
            lista.add(list.get(pom.get(i)));
        }

        return lista;
    }

    public void dodajKursy(ArrayList<Kurs> kurs, int index){
        for(int i=0; i<kurs.size(); i++) {
            ((Student) list.get(index)).dodajKurs(kurs.get(i));
        }
    }

    private void dodajKursy(ArrayList<Kurs> kurs, ArrayList<Integer> indeksy_kursow, ArrayList<Integer> indeksy_osob){

        for(int i=0; i<indeksy_osob.size(); i++){
            for(int j=0; j<indeksy_kursow.size(); j++){
                ((Student) list.get(indeksy_osob.get(i))).dodajKurs(kurs.get(indeksy_kursow.get(j)));
            }
        }
    }

    public void dodajKursyPoOsobach(ArrayList<Kurs> kurs, ArrayList<Osoba> b){

        for(int i=0; i<b.size(); i++){
            for(int j=0; j<kurs.size(); j++) {
                ((Student)b.get(i)).dodajKurs(kurs.get(j));
            }
        }
    }

    public void dodajKursyWgWytycznych(ArrayList<Kurs> a, String poCzym, Object cos,
                                  String poCzym2, Object cos2){
        Detector detector = new Detector();

        dodajKursy(a, detector.wyszukajKurs(a, poCzym, cos), detector.wyszukajStudent(list, poCzym2, cos2));
    }

    @Override
    public void sort(Comparator comp){
        Collections.sort(list, comp);
    }

    public void zapisz(){

        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("SpisOsob.ser"))){

            for(int i=0; i<list.size(); i++){
                out.writeObject(list.get(i));
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void odczyt(){

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("SpisOsob.ser"))){

            Osoba pom = ((Osoba) in.readObject());

            while(pom != null){
                list.add(pom);
                pom = ((Osoba) in.readObject());
            }

        }catch (Exception e){
            System.out.println("brak klasy lub puste juz po prostu :)");
        }
    }

    public void usunPowtarzajace(){
        HashSet<Osoba> pom = new HashSet<>();
        for(int i=0; i<list.size(); i++){
            pom.add(list.get(i));
        }
        list.clear();
        for(Osoba i : pom){
            list.add(i);
        }
    }

}
