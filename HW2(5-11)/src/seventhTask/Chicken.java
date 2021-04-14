package seventhTask;

public class Chicken extends NonFlyingBird {
    public Chicken(boolean layEggs) {
        super(true, layEggs);
    }

    @Override
    protected void greeting() {
        System.out.print("I'm chicken! ");
    }
}
