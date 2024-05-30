
package com.sprcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConf {

    @Bean
    public Write getWrite(){
        return new Write();
    }
    @Bean
    public Student getStudent(){
        //create new stu obj.
        Student stu = new Student(getWrite());

        return stu;
    }
}
