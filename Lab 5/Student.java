
class Student {
    static int studentId = 550;
    char studentType;
    String firstName;
    String lastName;
    String studentName;


    Student() {
        ++studentId;
    }


    Student(char studentType, String firstName, String lastName) {
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

    public static void main(String[] args) {
        Student studentOne = new Student('D', "Bony", "Thomas");
        studentOne.displayDetails();

        Student studentTwo = new Student('H', "Dinil", "Bose");
        studentTwo.displayDetails();
    }
}
