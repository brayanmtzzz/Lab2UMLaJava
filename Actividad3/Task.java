public abstract class Task {
    protected String name;

    public Task(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}