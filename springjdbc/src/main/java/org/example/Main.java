package org.example;

import dbo.StudentDao;
import entities.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("start....");
        ApplicationContext context = new ClassPathXmlApplicationContext("dbo/jdbc.xml");
        /*JdbcTemplate temp = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String query = "insert into student(id, name, city) values(?, ?, ?)"; //inserting queryy
        int r = temp.update(query,2,"xyz", "kanpur"); //inserting values
        System.out.println("num of rows inserted: " + r);
        */
        StudentDao sd = context.getBean("sdi", StudentDao.class);

        /*
        //insert
        Student student = new Student();
        student.setId(3);
        student.setName("abc");
        student.setCity("indore");


        int result = sd.insert(student);
        System.out.println("student added: " + result);

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
    }
}