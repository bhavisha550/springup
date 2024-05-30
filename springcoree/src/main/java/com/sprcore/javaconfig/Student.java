package com.sprcore.javaconfig;

import org.springframework.stereotype.Component;


public class Student {
    private Write write;

    public Student(Write write) {
        this.write = write;
    }

    public Write getWrite() {
        return write;
    }

    public void setWrite(Write write) {
        this.write = write;
    }

    @Override
    public String toString() {
        return "Student{" +
                "write=" + write +
                '}';
    }

    public void read(){
        System.out.println("the student is reading");
        this.write.display();
    }
}

