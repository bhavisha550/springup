package dbo;

import entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDboImpl implements StudentDao{

    private JdbcTemplate jdbcTemplate;
    @Override
    public int insert(Student student) {
        String query = "insert into student(id, name, city) values(?, ?, ?)";
        int res = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
        return res;
    }

    @Override
    public int change(Student student) {
        String query = "update student set name=?, city=? where id=?";
        int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return r;
    }

    @Override
    public int delete(int studentId) {
        String query = "delete from student where id=?";
        int r = this.jdbcTemplate.update(query, studentId);
        return r;

    }

    @Override
    public Student getStudent(int studentId) {
        String query = "select * from student where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student;
    }


    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}


