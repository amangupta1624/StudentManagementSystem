package StudentManagementApp;

import java.util.Scanner;

public class StudentManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
        	System.out.println("\t\t STUDENT MANAGEMENT SYSTEM");
        	System.out.println("\t\t*****************************");
            System.out.println("\t\t  1. Add Student");
            System.out.println("\t\t  2. Update Student");
            System.out.println("\t\t  3. Delete Student");
            System.out.println("\t\t  4. Display Students");
            System.out.println("\t\t  5. Exit");
            System.out.println();
            System.out.print("\t\t  Enter your choice: ");
            System.out.println();

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("\t\t  Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("\t\t  Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("\t\t  Enter Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    system.addStudent(new Student(id, name, age));
                    break;
                case 2:
                    System.out.print("\t\t  Enter Student ID to update: ");
                    String updateId = scanner.nextLine();
                    System.out.print("\t\t  Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("\t\t  Enter New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    system.updateStudent(updateId, newName, newAge);
                    break;
                case 3:
                    System.out.print("\t\t  Enter Student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    system.deleteStudent(deleteId);
                    break;
                case 4:
                    system.displayStudents();
                    break;
                case 5:
                    System.out.println("\t\t  Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t\tInvalid choice. Please try again.");
            }
        }
    }
}
