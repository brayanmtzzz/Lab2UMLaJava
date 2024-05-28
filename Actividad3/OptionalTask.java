public class OptionalTask extends Task {
    private int points;

    public OptionalTask(String name, int points) {
        super(name);
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}