package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_details")
public class Patient {
    @Id
    @Column(name="patient_id")
    private int patientId;
    @Column(name="patient_name")
    private String patientName;
    @Column(name="selected_measure")
    private String selectedMeasure;

    public Patient(int patientId, String patientName, String selectedMeasure) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.selectedMeasure = selectedMeasure;
    }

    public Patient() {

    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getSelectedMeasure() {
        return selectedMeasure;
    }

    public void setSelectedMeasure(String selectedMeasure) {
        this.selectedMeasure = selectedMeasure;
    }
}
