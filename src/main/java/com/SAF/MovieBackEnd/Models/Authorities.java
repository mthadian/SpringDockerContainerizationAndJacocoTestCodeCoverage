/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SAF.MovieBackEnd.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import static javax.swing.text.StyleConstants.Size;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author PMMuthama 
 */
@Entity
public class Authorities 
{
    @Id
    private int authorityId;
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "AUTHORITY")
    private String authority;
    
    
    
    @JoinColumn(name = "USERNAME", referencedColumnName = "USERNAME")
    @ManyToOne(optional = false)
    private Users username;

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public int getAuthorityId() {
        return authorityId;
    }

    public void setAuthorityId(int authorityId) {
        this.authorityId = authorityId;
    }

    public Users getUsername() {
        return username;
    }

    public void setUsername(Users username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Authorities{" + "authority=" + authority + ", authorityId=" + authorityId + ", username=" + username + '}';
    }

   
    
    
}
