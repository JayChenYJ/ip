/**
 * Represent a task added by a user.
 */
public class Task {
    /**
     * The content of the task.
     */
    protected String description;

    /**
     * A boolean deciding whether a task has been completed.
     * Task completion is triggered by the user.
     */
    protected boolean isDone;

    /**
     * Creates a new task with a given input by the user.
     * Task is initially not done at creation.
     * @param description The input given by the user.
     */
    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Get the status icon of the task.
     * @return Return an icon, cross if done, empty space if not done.
     */
    public String getStatusIcon() {
        return (isDone ? "\u2718" : " ");
    }

    /**
     * Change the status of the the task completion to true when the task has been completed.
     */
    public void makeDone() {
        this.isDone = true;
    }

    /**
     * A display to show the task information.
     * @return Show the status of the task, together with its description.
     */
    public String display() {
        return "[" + getStatusIcon() + "] " + description;
    }
}