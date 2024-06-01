package com.spring.orm.Dao;

import com.spring.orm.entities.Patient;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class PatientDao {

    private HibernateTemplate hibernateTemplate;
    @Transactional
    public int insert(Patient patient)
    {
        //insert
        Integer i = (Integer) this.hibernateTemplate.save(patient);
        return i;
    }
    //get single data
    public Patient getPatient(int patientId)
    {
        Patient patient = this.hibernateTemplate.get(Patient.class, patientId);
        return patient;
    }
    //get all rows
    public List<Patient> getAllPatients()
    {
        List<Patient> patients = this.hibernateTemplate.loadAll(Patient.class);
        return patients;
    }

    //delete
    @Transactional
    public void deletePatient(int patientId)
    {
        Patient patient = this.hibernateTemplate.get(Patient.class, patientId);
        this.hibernateTemplate.delete(patient);
    }

    //update
    @Transactional
    public void updatePatient(Patient patient){
        this.hibernateTemplate.update(patient);
    }
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
