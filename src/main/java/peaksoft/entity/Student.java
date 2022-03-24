package peaksoft.entity;


import javax.persistence.*;

@Entity
@Table(name = "Students")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long StudentID;

    private String student_name;
    private String student_surname;
    private String course;


    public Student() {

    }
    public Student(String student_name, String student_surname, String course) {
        this.student_name = student_name;
        this.student_surname = student_surname;
        this.course = course;
    }



    public long getStudentID() {
        return StudentID;
    }

    public void setStudentID(long studentID) {
        StudentID = studentID;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_surname() {
        return student_surname;
    }

    public void setStudent_surname(String student_surname) {
        this.student_surname = student_surname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentID=" + StudentID +
                ", student_name='" + student_name + '\'' +
                ", student_surname='" + student_surname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
