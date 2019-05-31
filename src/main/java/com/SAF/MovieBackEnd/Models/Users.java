/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SAF.MovieBackEnd.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author PMMuthama
 */

@Entity

public class Users 
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;
    
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PASSWORD")
    private String password;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "username")
    @JsonIgnore
    private Collection<Authorities> authoritiesCollection;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Authorities> getAuthoritiesCollection() {
        return authoritiesCollection;
    }

    public void setAuthoritiesCollection(Collection<Authorities> authoritiesCollection) {
        this.authoritiesCollection = authoritiesCollection;
    }

    @Override
    public String toString() {
        return "Users{" + "userId=" + userId + ", username=" + username + ", password=" + password + ", authoritiesCollection=" + authoritiesCollection + '}';
    }

   
    
    
    
}
