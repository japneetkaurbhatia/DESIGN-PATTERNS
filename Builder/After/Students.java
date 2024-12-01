import java.util.List;

public class Students {
    private final int rollNumber; // only mandatory field
    private final int age; // optional field
    private final String name; 
    private final String fatherName;
    private final String motherName;
    private final List<String> subjects;
    private final String mobile;

    public Students(StudentBuilder builder) {
        this.rollNumber = builder.getRollNumber();
        this.age = builder.getAge();
        this.name = builder.getName();
        this.fatherName = builder.getFatherName();
        this.motherName = builder.getMotherName();
        this.subjects = builder.getSubjects();
        this.mobile = builder.getMobile();
    }

    public String toString() {
        return "Roll Number: " + rollNumber + "\n" +
               "Age: " + age + "\n" +
               "Name: " + name + "\n" +
               "Father's Name: " + fatherName + "\n" +
               "Mother's Name: " + motherName + "\n" +
               "Subjects: " + subjects + "\n" +
               "Mobile: " + mobile;
    }
}