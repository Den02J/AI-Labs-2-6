package Lab2;

import java.util.Objects;

public class Student {
    public String fullName;
    public Specialty specialty;

    public Student() {
    }

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public Student(String fullName, Specialty specialty) {
        this.fullName = fullName;
        this.specialty = specialty;
    }

    public Student(String id, String fullName, Specialty specialty) {
        this.fullName = fullName;
        this.specialty = specialty;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", specialty=" + specialty +
                '}';
    }
}

