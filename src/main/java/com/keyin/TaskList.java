package com.keyin;

public class TaskList {
    private Node head;

    private class Node { //Inner class that defines tasks in list
        Task task;
        Node next;

        Node(Task task) { //Constructor for Node, taking tasks as parameters
            this.task = task;
            this.next = null;
        }
    }

    public void add(Task task) { //Adds a task to the list
        Node newNode = new Node(task); //Creates a node containing the task
        if (head == null) {
            head = newNode; //Sets node as head if list is empty
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; //Locates last node if list is not empty
            }
            current.next = newNode; //Adds node after the last node
        }
    }

    public void markTaskAsCompleted(String description) { //Marks a task as completed
        Node current = head; //Starts at the head of the list
        while (current != null) {
            if (current.task.getDescription().equals(description)) { //Checks if the task description is the same as the provided description
                current.task.markAsCompleted(); //Marks as complete on a match
                return;
            }
            current = current.next; //Moves to next task in list
        }
    }

    public void printAllTasks() { //Prints all tasks in a list
        Node current = head; //Starts at list head
        while (current != null) {
            System.out.println(current.task); //Prints description and completion status of task
            current = current.next; //Moves to next task
        }
    }
}
