// src/app/MVCPatternDemo.java
package app;

import model.Student;
import view.StudentView;
import controller.StudentController;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student student = new Student("S1001", "Alice", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println("\n-- Updating Student Details --\n");

        controller.setStudentName("Alice Johnson");
        controller.setStudentGrade("A+");
        controller.updateView();
    }
}
