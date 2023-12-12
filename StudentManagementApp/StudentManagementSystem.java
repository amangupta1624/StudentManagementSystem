package StudentManagementApp;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println();
        System.out.println("\t\tStudent added successfully.");
        System.out.println();
        System.out.println();
    }

    public void updateStudent(String studentId, String name, int age) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                student.name = name;
                student.age = age;
                System.out.println("\t\tStudent updated successfully.");
                System.out.println();
                System.out.println();
                return;
            }
        }
        System.out.println("\t\tStudent not found.");
        System.out.println();
        System.out.println();
    }

    public void deleteStudent(String studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
        System.out.println("\t\tStudent deleted successfully.");
        System.out.println();
        System.out.println();
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println("\t\tStudent ID: " + student.getStudentId());
            System.out.println("\t\tName: " + student.getName());
            System.out.println("\t\tAge: " + student.getAge());
            System.out.println("\t\t--------------");
        }
    }
}
