package com.example.taskmanager;

public class Main {
    public static void main(String[] args) {
        TaskList tasks = new TaskList();

        tasks.add(new Task(1, "Write report", "pending"));
        tasks.add(new Task(2, "Email team",   "in-progress"));
        tasks.add(new Task(3, "Fix bug #42",  "pending"));

        System.out.println("All tasks:");
        tasks.traverse();

        int searchId = 2;
        Task found = tasks.search(searchId);
        System.out.println("\nSearching for task " + searchId + ": " + 
                           (found != null ? found : "Not found"));

        int deleteId = 1;
        boolean deleted = tasks.delete(deleteId);
        System.out.println("\nDeleting task " + deleteId + ": " + 
                           (deleted ? "Success" : "Not found"));

        System.out.println("\nTasks after deletion:");
        tasks.traverse();
    }
}
 