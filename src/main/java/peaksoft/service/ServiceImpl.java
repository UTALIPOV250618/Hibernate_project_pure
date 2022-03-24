package peaksoft.service;

import org.hibernate.Session;
import peaksoft.entity.Student;
import peaksoft.util.HibernateConf;

import java.util.List;

public class ServiceImpl implements Service {

    private Student student;

    @Override
    public long createStudent(Student student) {
        Session session = HibernateConf.getSession().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction();
        session.close();
        System.out.println("Table created successfully:" + student);
        return  student.getStudentID();
    }



    @Override
    public void updateStudentCourse(long id,String course) {
        Session session = HibernateConf.getSession().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        student.setCourse(course);
        session.getTransaction().commit();
        session.close();
        System.out.println("Students info updated successfully! ");

    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public List<Student> getAllStudent() {

        Session session = HibernateConf.getSession().openSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("FROM Student").getResultList();
        session.getTransaction().commit();
        session.close();
        if (students.size() == 1) {
            System.out.println(students.size()+ " student exists in Students.class");
        } else {
            System.out.println(students.size()+ " students exists in Students.class");
        }

        return students;


    }

    @Override
    public void getStudentById() {

    }
}
