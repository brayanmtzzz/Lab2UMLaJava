public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public boolean performTask(Task task) {
        System.out.println(name + " is performing task: " + task.getName());
        if (task instanceof OptionalTask) {
            OptionalTask optionalTask = (OptionalTask) task;
            System.out.println("This is an optional task with " + optionalTask.getPoints() + " points.");
            return optionalTask.getPoints() > 0;
        } else if (task instanceof AdministrativeTask) {
            System.out.println("This is an administrative task.");
            return true;
        } else {
            return false;
        }
    }
}