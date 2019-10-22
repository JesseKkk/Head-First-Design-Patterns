
/**
 * Created by Kong on 2019/10/9.
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }

    @Override
    public String toString()
    {
        return "Quackologist";
    }
}
