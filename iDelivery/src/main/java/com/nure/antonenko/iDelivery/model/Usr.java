package com.nure.antonenko.iDelivery.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;


@Entity(name = "Usr")
public class Usr {

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
    private UsrRole role;

    public Usr(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public UsrRole getRole() {
        return role;
    }

    public void setRole(UsrRole role) {
        this.role = role;
    }
}
