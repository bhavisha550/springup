package org.example;

import dbo.StudentDao;
import dbo.StudentDboImpl;
import entities.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"dbo"})
public class JdbcCon {
    @Bean("ds")
    public DriverManagerDataSource getDataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("org.postgresql.Driver");
        ds.setUrl("jdbc:postgresql://localhost:5432/springjdbc");
        ds.setUsername("postgres");
        ds.setPassword("postgres");
        return ds;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;

    }

    /* //(uncomment without autowiring)
    @Bean("studentDao")
    public StudentDao getStudentDao(){
        StudentDboImpl studentDao = new StudentDboImpl();
        studentDao.setJdbcTemplate(getTemplate());
        return studentDao;
    }
    */
}

