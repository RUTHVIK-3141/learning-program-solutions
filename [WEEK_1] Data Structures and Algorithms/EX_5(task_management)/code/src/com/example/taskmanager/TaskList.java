package com.example.taskmanager;

public class TaskList {
    private TaskNode head;

    public TaskList() {
        head = null;
    }

    public void add(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
            return;
        }
        TaskNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void traverse() {
        TaskNode curr = head;
        while (curr != null) {
            System.out.println(curr.task);
            curr = curr.next;
        }
    }

    public Task search(int taskId) {
        TaskNode curr = head;
        while (curr != null) {
            if (curr.task.getTaskId() == taskId) {
                return curr.task;
            }
            curr = curr.next;
        }
        return null;
    }

    public boolean delete(int taskId) {
        TaskNode curr = head;
        TaskNode prev = null;
        while (curr != null) {
            if (curr.task.getTaskId() == taskId) {
                if (prev == null) {
                    head = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return true;
            }
            prev = curr;
            curr = curr.next;
        }
        return false;
    }
}
