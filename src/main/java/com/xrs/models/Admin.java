package com.xrs.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by rajan on 24/1/17.
 */
@Entity
@Table(name = "users")
public class Admin {
    @Id
    private String id;
    private String password;
    private String adminType;

    public Admin(){}

    public Admin(String id, String password, String adminType) {
        this.id = id;
        this.password = password;
        this.adminType = adminType;
    }

    public Admin(String id, String password) {

        this.id = id;
        this.password = password;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
