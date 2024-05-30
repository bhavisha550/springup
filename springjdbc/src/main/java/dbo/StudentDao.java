package dbo;

import entities.Student;

import java.util.List;

public interface StudentDao{
    public int insert(Student student); //insert
    public int change(Student student); //update
    public int delete(int studentId); //delete
    public Student getStudent(int studentId);
    public List<Student> getAllStudents();


}