package seventhTask;

public abstract class Bird {
    protected boolean feathers;
    protected boolean layEggs;

    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public void info() {
        greeting();
        fly();
        String isPlumageExist = (feathers) ? " I have feathers" : " I have not feathers";
        String layEggsAnswer = (layEggs) ? " and I lay eggs" : " and I don't lay eggs";
        System.out.println(isPlumageExist + layEggsAnswer);
    }

    protected abstract void greeting();
    protected abstract void fly();

}
