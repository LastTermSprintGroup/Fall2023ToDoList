package com.keyin;

public class Task {
    // Declaring private fields for task details.
    private String description;
    private boolean isCompleted;

    // Constructor for the Task class.
    public Task(String description) {
        // Initializing fields.
        this.description = description;
        this.isCompleted = false; // By default, a task is not completed.
    }

    // Getter to retrieve description.
    public String getDescription() {
        return description;
    }

    // Getter to retrieve task completion.
    public boolean isCompleted() {
        return isCompleted;
    }

    // Marking task as completed.
    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        // Printing string representation of task.
        return description + (isCompleted ? " (Completed)" : " (Not Completed)");
    }
}
