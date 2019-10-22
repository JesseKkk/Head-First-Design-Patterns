/**
 * Created by Kong on 2019/10/9.
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
