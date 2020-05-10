package com.nure.antonenko.iDelivery.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Courier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "login")
    private String login;

    @JsonIgnore
    @Column(name = "pass")
    private String pass;

    @Column(name = "name")
    private String name;

    @ManyToOne
    private Company company;

    @ManyToOne
    private CourierStatus courierStatus;

    @Column(name = "registrDate")
    private Date registrDate;

    @Column(name = "contacts")
    private String contacts;

    @Column(name = "workTime")
    private String workTime;

    @Column(name = "location")
    private String location;

    public Courier(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public CourierStatus getCourierStatus() {
        return courierStatus;
    }

    public void setCourierStatus(CourierStatus courierStatus) {
        this.courierStatus = courierStatus;
    }

    public Date getRegistrDate() {
        return registrDate;
    }

    public void setRegistrDate(Date registrDate) {
        this.registrDate = registrDate;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
