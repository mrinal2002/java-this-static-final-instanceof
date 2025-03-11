class Student {
    private static String universityName = "RGPV University"; // Static variable shared across all students
    private static int totalStudents = 0; // Static variable to track total students
    private final int rollNumber; // Final variable (can't be changed)
    private String name;
    private String grade;

    // Constructor using 'this' to initialize instance variables
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++; // Increment total students count
    }

    public void displayStudentDetails() {
        if (this instanceof Student) { // Using instanceof
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("-------------------------");
        }
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        Student stu1 = new Student(101, "Aman", "A");
        Student stu2 = new Student(102, "Adarsh", "B");

        // Display student details
        stu1.displayStudentDetails();
        stu2.displayStudentDetails();

        // Display total students enrolled
        Student.displayTotalStudents();
    }
}
