package org.designpatterns.c02observerpattern.subject;


import org.designpatterns.c02observerpattern.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
