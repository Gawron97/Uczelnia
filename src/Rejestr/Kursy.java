package Rejestr;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Detector.Detector;
import Kursy.Kurs;

public class Kursy implements Rejestr, Serializable {

    private ArrayList<Kurs> kursy;

    public Kursy(){
        kursy = new ArrayList<>();
    }

    @Override
    public void dodaj(Object kurs){
        kursy.add((Kurs)kurs);
    }

    @Override
    public void dodaj(ArrayList<Object> kurs){

        for(int i=0; i<kurs.size(); i++) {
            kursy.add((Kurs) (kurs.get(i)));
        }
    }

    @Override
    public void usun(Object kurs){
        kursy.remove((Kurs) kurs);
    }

    @Override
    public void usun(int index){
        kursy.remove(index);
    }

    @Override
    public void usun(ArrayList<Integer> a){
        for(int i=a.size()-1; i>=0; i--){
            kursy.remove((int) a.get(i));
        }
    }

    public void usun(String poCzym, Object cos){
        Detector detector = new Detector();

        usun(detector.wyszukajKurs(kursy, poCzym, cos));
    }

    public ArrayList<Kurs> getKursy() {
        return kursy;
    }

    public void setKursy(ArrayList<Kurs> kursy) {
        this.kursy = kursy;
    }

    @Override
    public void wyswietl(){
        for(int i=0; i<kursy.size(); i++){
            System.out.println(kursy.get(i));
        }
    }

    @Override
    public void wyswietlPoIndeksach(ArrayList<Integer> a){
        for(int i=0; i<a.size(); i++){
            System.out.println(kursy.get(a.get(i)));
        }
    }

    public void wyswietlDaneKursy(String poCzym, Object cos){

        Detector detector = new Detector();
        ArrayList<Integer> pom = new ArrayList<>();

        pom = detector.wyszukajKurs(kursy, poCzym, cos);

        for(int i=0; i<pom.size(); i++){
            System.out.println(kursy.get(pom.get(i)));
        }

    }

    public ArrayList<Kurs> zwrocPoIndeksach(ArrayList<Integer> a){
        ArrayList<Kurs> pom = new ArrayList<>();

        for(int i=0; i<a.size(); i++){
            pom.add(kursy.get(a.get(i)));
        }

        return pom;
    }

    public ArrayList<Kurs> zwrocOkreslony(ArrayList<Kurs> a, Class<?> typ, String poCzym, Object cos){
        ArrayList<Integer> pom = new ArrayList<>();
        Detector detector = new Detector();
        pom = detector.wyszukajKurs(a, poCzym, cos);

        ArrayList<Kurs> lista = new ArrayList<>();

        for(int i=0; i<pom.size(); i++){
            lista.add(kursy.get(pom.get(i)));
        }
        return lista;
    }

    @Override
    public void sort(Comparator comp) {
        Collections.sort(kursy, comp);
    }
}
