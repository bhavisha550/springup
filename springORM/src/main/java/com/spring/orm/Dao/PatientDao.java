package com.spring.orm.Dao;

import com.spring.orm.entities.Patient;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class PatientDao {

    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int insert(Patient patient)
    {
        //insert
        Integer i = (Integer) this.hibernateTemplate.save(patient);
        return i;
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
