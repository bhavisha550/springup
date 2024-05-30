package org.example;

import dbo.StudentDao;
import dbo.StudentDboImpl;
import entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("start....");
        //(uncomment to run with xml file)ApplicationContext context = new ClassPathXmlApplicationContext("org/example/jdbc.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcCon.class);
        JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);
        StudentDao sd = new StudentDboImpl(temp);
        /*
        String query = "insert into student(id, name, city) values(?, ?, ?)"; //inserting queryy
        int r = temp.update(query,2,"xyz", "kanpur"); //inserting values
        System.out.println("num of rows inserted: " + r);
        */
        StudentDao sdo = context.getBean("studentDao", StudentDao.class);

        /*
        //insert
        Student student = new Student();
        student.setId(3);
        student.setName("abc");
        student.setCity("indore");


        int result = sd.insert(student);
        System.out.println("student added: " + result);
        /*
        //update
        Student student = new Student();
        student.setId(3);
        student.setName("abb");
        student.setCity("mumbai");

        int rest = sd.change(student);
        System.out.println("data changed: " + rest);


        //delete
        int result = sd.delete(3);
        System.out.println("deleted: " + result);
        */


        //select
        Student student = sd.getStudent(1);
        System.out.println(student);



        List<Student> students = sd.getAllStudents();
        for(Student s:students)
        {
            System.out.println(s);
        }


    }

}
