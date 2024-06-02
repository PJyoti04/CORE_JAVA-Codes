class StudentNew{
    static int studentCount = 0;
    static int studentId = 550;
    char studentType;
    String firstName;
    String lastName;
    String studentName;

    StudentNew() {
        studentCount++;
        studentId++;
    }

    StudentNew(char studentType, String firstName, String lastName) {
        this();
        this.studentType = studentType;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentName = firstName + " " + lastName;
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Type: " + studentType);
        System.out.println("Student Name: " + studentName);
    }

    static int getStudentCount() {
        return studentCount;
    }

    public static void main(String[] args) {
        studentCount = 10; // Initialize student count to 10 (as already 10 students have enrolled)

        StudentNew studentOne = new StudentNew('D', "Bony", "Thomas");
        studentOne.displayDetails();

        StudentNew studentTwo = new StudentNew('H', "Dinil", "Bose");
        studentTwo.displayDetails();

        System.out.println("Total number of students: " + getStudentCount());
    }
}
