import java.util.List;

public class StudentBuilder {
    private int rollNumber;
    private int age;
    private String name;
    private String fatherName;
    private String motherName;
    private List<String> subjects;
    private String mobile;

    public StudentBuilder(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder fatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder motherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder subjects(List<String> subjects) {
        this.subjects = subjects;
        return this;
    }

    public StudentBuilder mobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public String getMobile() {
        return mobile;
    }

    public Students build() {
        return new Students(this);
    }
}