package seventhTask;

public class FlyingBird extends Bird {

    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    protected void greeting() {}

    @Override
    protected void fly() {
        System.out.print("I believe I can fly!");
    }

}
