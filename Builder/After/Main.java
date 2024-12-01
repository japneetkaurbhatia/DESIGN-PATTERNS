import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Students studentFillingAllDetails = new StudentBuilder(1)
                .age(20)
                .name("student-name")
                .fatherName("father-name")
                .motherName("mother-name")
                .subjects(Arrays.asList("Math", "Science"))
                .mobile("1234567890")
                .build();

        System.out.println(studentFillingAllDetails.toString()); 

        System.out.println();

        Students studentFillingSomeDetails = new StudentBuilder(1)
                .age(20)
                .name("student-name")
                .fatherName("father-name")
                .motherName("mother-name")
                .build();

        System.out.println(studentFillingSomeDetails.toString());
    }
}
