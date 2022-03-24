package peaksoft.service;

import peaksoft.entity.Student;

import java.util.List;

public interface Service {



    long createStudent(Student student);
    void updateStudentCourse(long id,String course);
    void deleteStudent();
    List<Student> getAllStudent();
    void getStudentById();
}
