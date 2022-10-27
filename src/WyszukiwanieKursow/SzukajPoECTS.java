package WyszukiwanieKursow;
import Kursy.Kurs;

import java.util.ArrayList;

public class SzukajPoECTS implements WyszukiwanieKursy{

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Kurs> a, Object cos) {
        ArrayList<Integer> indeksy = new ArrayList<>();
        int cos1 = Integer.parseInt((String) cos);

        for(int i=0; i<a.size(); i++){
            if(a.get(i).getECTS() == cos1)
                indeksy.add(i);
        }

        return indeksy;
    }

}
