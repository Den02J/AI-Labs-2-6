package Lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Examiner {
    public String fullName;
    public String subject;
    public List<Student> Students = new ArrayList<>();

    public Examiner() {
    }

    public Examiner(String fullName) {
        this.fullName = fullName;
    }

    public Examiner(String fullName, String subject) {
        this.fullName = fullName;
        this.subject = subject;
    }

    public void addStudentToExaminer(Student student) {
        this.Students.add(student);
        System.out.println("Student " + student.fullName + " is added to examiner " + this.fullName + " on subject: " + this.subject);
    }

    public void clearStudents() {
        this.Students.clear();
        System.out.println("All student were removed from " + this.fullName + " on " + this.subject);
    }



    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Examiner{" +
                "fullName='" + fullName + '\'' +
                ", subject='" + subject + '\'' +
                ", Students=" + Students +
                '}';
    }
}
