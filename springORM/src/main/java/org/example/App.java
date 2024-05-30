package org.example;

import com.spring.orm.Dao.PatientDao;
import com.spring.orm.entities.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("ormConfig.xml");
        PatientDao patientDao = context.getBean("patientDao", PatientDao.class);
        Patient patient = new Patient(12, "abc", "URI");
        int r = patientDao.insert(patient);
        System.out.println(r);
    }
}
