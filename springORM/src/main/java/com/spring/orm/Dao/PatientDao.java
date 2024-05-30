package com.spring.orm.Dao;

import com.spring.orm.entities.Patient;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class PatientDao {

    private HibernateTemplate hibernateTemplate;
    public int insert(Patient patient)
    {
        //insert
        Integer i = (Integer) this.hibernateTemplate.save(patient);
        return i;
    }
}
