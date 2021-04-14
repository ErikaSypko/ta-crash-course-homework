package seventhTask;

public class Swallow extends FlyingBird {
    public Swallow(boolean layEggs) {
        super(true, layEggs);
    }

    @Override
    protected void greeting() {
        System.out.print("I'm swallow! ");
    }
}
