package Kursy;

import Osoby.Observer;

public interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
