package seventhTask;

public class Penguin extends NonFlyingBird {
    public Penguin(boolean layEggs) {
        super(true, layEggs);
    }

    @Override
    protected void greeting() {
        System.out.print("I'm penguin! ");
    }
}
