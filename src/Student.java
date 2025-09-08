public class Student {
    private String name;
    private String studentId;

    public Student(String name, String studentId){
        this.name = name;
        this.studentId = studentId;
    }

    // Getters
    public String getName() { return name; }
    public String getStudentId() { return studentId; }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + studentId;
    }
}
