package Lab2;

public class LogicModel {
    public static void main(String[] args) {

        Specialty sp1 = new Specialty(
                "Software Engineering",
                "Math",
                "English",
                "Physics");

        System.out.println(sp1.toString());
        System.out.println();

        Student st1 = new Student("Mattew Green", sp1);
        Student st2 = new Student("Natan Red", sp1);

        System.out.println(st1.toString());
        System.out.println(st2.toString());
        System.out.println();

        Examiner ex1 = new Examiner("Violet Blue", "English");

        System.out.println(ex1.toString());
        System.out.println();

        ex1.addStudentToExaminer(st1);
        ex1.addStudentToExaminer(st2);

        System.out.println(ex1.toString());
    }
}
