package WyszukiwanieOsob;
import Osoby.Osoba;
import Osoby.Student;
import java.util.ArrayList;

public class SzukajPoIStopniu implements WyszukiwanieOsoby{

    @Override
    public ArrayList<Integer> szukaj(ArrayList<Osoba> a, Class<?> typ, Object cos) {

        ArrayList<Integer> indeksy = new ArrayList<>();

        boolean cos1 = Boolean.parseBoolean((String) cos);

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getClass().equals(typ)) {
                if (((Student) a.get(i)).isI_stopien() == cos1)
                    indeksy.add(i);
            }
        }
        return indeksy;
    }

}
