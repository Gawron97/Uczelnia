package Comparatory;


import Kursy.Kurs;

import java.util.Comparator;

public class CompareKursyPoECTS implements Comparator<Kurs> {

    @Override
    public int compare(Kurs o1, Kurs o2){
        return o1.getECTS() - o2.getECTS();
    }
}
