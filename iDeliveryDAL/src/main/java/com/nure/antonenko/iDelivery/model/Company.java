package com.nure.antonenko.iDelivery.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Company")
public class Company {
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

    @Column(name = "photo")
    private String photo;

    @JsonIgnore
    @Column(name = "host")
    private String host;

    @ManyToOne
    private CompanyCategory companyCategory;

    @OneToMany
    private List<Adress> adresses;

    @OneToMany
    private List<Product> products;

    @Column(name = "timeOfWork")
    private String timeOfWork;

    public Company(){

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public CompanyCategory getCompanyCategory() {
        return companyCategory;
    }

    public void setCompanyCategory(CompanyCategory companyCategory) {
        this.companyCategory = companyCategory;
    }

    public String getTimeOfWork() {
        return timeOfWork;
    }

    public void setTimeOfWork(String timeOfWork) {
        this.timeOfWork = timeOfWork;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
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

    public List<Adress> getAdresses() {
        return adresses;
    }

    public void setAdresses(List<Adress> adresses) {
        this.adresses = adresses;
    }
}
