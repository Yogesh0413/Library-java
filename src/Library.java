import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    private static ArrayList<Books> books = new ArrayList<>();
    private static ArrayList<Student> students = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Student");
            System.out.println("4. View Students");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch(choice){
                case 1: addBook(); break;
                case 2: viewBooks(); break;
                case 3: addStudent(); break;
                case 4: viewStudents(); break;
                case 5: System.exit(0);
                default: System.out.println("Invalid option!");
            }
        }
    }

    private static void addBook(){
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        books.add(new Books(title, author));
        System.out.println("Book added successfully!");
    }

    private static void viewBooks(){
        if(books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for(Books b : books){
                System.out.println(b);
            }
        }
    }

    private static void addStudent(){
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter student ID: ");
        String id = sc.nextLine();
        students.add(new Student(name, id));
        System.out.println("Student added successfully!");
    }

    private static void viewStudents(){
        if(students.isEmpty()) {
            System.out.println("No students registered.");
        } else {
            for(Student s : students){
                System.out.println(s);
            }
        }
    }
}
