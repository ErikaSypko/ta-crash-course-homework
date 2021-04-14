package seventhTask;

public class NonFlyingBird extends Bird {

    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    protected void greeting() {}


    @Override
    protected void fly() {
        System.out.print("I can't fly :(");
    }

}
