package peaksoft.service;

import peaksoft.entity.Student;

import java.util.List;

public interface Service {



    long createStudent(Student student);
    void updateStudentCourse(long id,String course);
    void deleteStudentById(long id);
    List<Student> getAllStudent();
    Student getStudentById(long id);
}
