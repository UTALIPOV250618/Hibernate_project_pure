package peaksoft;

import peaksoft.entity.Student;
import peaksoft.service.ServiceImpl;


public class App 
{
    public static void main( String[] args )
    {
//
        Student student = new Student("Nurbek","Kamilov","Java");
        ServiceImpl service = new ServiceImpl();
//        service.createStudent(student);
//        service.updateStudentCourse(1,"javascript");
        service.getAllStudent();
    }
}
