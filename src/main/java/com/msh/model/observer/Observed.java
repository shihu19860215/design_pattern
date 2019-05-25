package com.msh.model.observer;

/**
 * 被观察者
 */
public interface Observed {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void toDo(Object o);
}
