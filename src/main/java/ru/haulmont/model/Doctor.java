package ru.haulmont.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DOCTOR")
public class Doctor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "ID")
    private Long Id;
    @Column(name = "FIRSTNAME")
    private String Firstname;
    @Column(name="LASTNAME")
    private String Lastname;
    @Column(name = "MIDDLENAME")
    private String Middlename;
    @Column(name="SPECIALIZE")
    private String Specialize;

    public void setSpecialize(String specialize) {
        Specialize = specialize;
    }

    public String getSpecialize() {
        return Specialize;
    }

    public Long getId() {
        return Id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getMiddlename() {
        return Middlename;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setMiddlename(String middlename) {
        Middlename = middlename;
    }
}
