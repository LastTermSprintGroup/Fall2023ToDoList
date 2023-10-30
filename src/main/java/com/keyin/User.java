package com.keyin;

public class User {
    // Private fields for the user's name and a to-do list
    private String name;
    private TaskList toDoList;

    // Constructor for the User class, which takes the user's name as a parameter
    public User(String name) {
        // Initialize the name field with the provided name
        this.name = name;
        // Create a new TaskList for the user to manage tasks
        this.toDoList = new TaskList();
    }

    // Retrieve the user's name
    public String getName() {
        return name;
    }

    // Add a new task to the user's to-do list
    public void addTask(String description) {
        // Create a new Task object with the provided description
        Task task = new Task(description);
        // Add the task to the user's to-do list
        toDoList.add(task);
    }

    // Mark a task as completed in the user's to-do list based on its description
    public void markTaskAsCompleted(String description) {
        // Delegate the task completion to the to-do list
        toDoList.markTaskAsCompleted(description);
    }

    // Print all tasks in the user's to-do list
    public void printAllTasks() {
        // Display the user's name as a header for the to-do list
        System.out.println(name + "'s To-Do List:");
        // Delegate the task printing to the to-do list
        toDoList.printAllTasks();
    }

    // Test the User class
    public static void main(String[] args) {
        // Create a new user
        User user = new User("Alice");
        // Add tasks to to-do list
        user.addTask("Buy groceries");
        user.addTask("Go to the gym");
        // Print all tasks in to-do list
        user.printAllTasks();
        // Mark a task as completed
        user.markTaskAsCompleted("Buy groceries");
        // Print the updated to-do list after marking a task as completed
        user.printAllTasks();
    }
}
