package dbo;

import entities.Student;

public interface StudentDao{
    public int insert(Student student); //insert
    public int change(Student student); //update
    public int delete(int studentId); //delete
    public Student getStudent(int studentId);


}