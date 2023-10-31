package com.keyin;

public class Main {
    public static void main(String[] args) {
        // 1. Creates users and adds them to an array.
        User[] users = new User[2];
        users[0] = new User("Alice");
        users[1] = new User("Bob");

        // 2. Adds tasks to user’s to-do lists.
        users[0].addTask("Buy groceries");
        users[0].addTask("Go to the gym");
        users[0].addTask("Pay bills");
        users[1].addTask("Finish the report");
        users[1].addTask("Attend the meeting");
        users[1].addTask("Reply to emails");

        // 3. Marks tasks as completed.
        users[0].markTaskAsCompleted("Buy groceries");
        users[0].markTaskAsCompleted("Pay bills");
        users[1].markTaskAsCompleted("Attend the meeting");
        users[1].markTaskAsCompleted("Reply to emails");

        // 4. Prints all tasks for each user.
        for (User user : users) {
            user.printAllTasks();
            System.out.println();  // Just to separate the lists for clarity
        }
    }
}
