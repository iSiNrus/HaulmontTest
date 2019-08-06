package ru.haulmont.DAO;

import ru.haulmont.model.Doctor;

public class DoctorDAO extends DAO<Doctor> {

    public DoctorDAO(){
        settClass(Doctor.class);
    }
}
