package Interfaces;

/**
 * Created by nimtego_loc on 01.12.2016.
 */
public interface MapObservable {
    void addObserver(MapObserverConcrete mapObserverConcrete);
    void removeObserver(MapObserverConcrete mapObserverConcrete);
    void notifyObserver();
}
