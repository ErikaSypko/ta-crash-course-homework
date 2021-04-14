package seventhTask;

public class Eagle extends FlyingBird {

    public Eagle(boolean layEggs) {
        super(true, layEggs);
    }

    @Override
    protected void greeting() {
        System.out.print("I'm eagle! ");
    }
}
