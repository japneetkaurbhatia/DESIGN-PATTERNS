import java.util.List;

public class Student {
    int rollNumber; // only manadtory field
    /* optional field */
    int age; 
    String name; 
    String fatherName;
    String motherName;
    List<String> subjects;
    String mobile;

    public Student(int rollNumber, int age, String name, String fatherName, String motherName, List<String> subjects, String mobile) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.subjects = subjects;
        this.mobile = mobile;
    }

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(int rollNumber, int age) {
        this.rollNumber = rollNumber;
        this.age = age;
    }

    public Student(int rollNumber, int age, String name) {
        this.rollNumber = rollNumber;
        this.age = age;
        this.name = name;
    }

    public Student(int rollNumber, String fatherName, String motherName) {
        this.rollNumber = rollNumber;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    // public Student(int rollNumber, String name, String mobile) {
    //     this.rollNumber = rollNumber;
    //     this.name = name;
    //     this.mobile = mobile;
    // }
}