/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contact;

/**
 *
 * @author aboudou.diakite
 */
public class Contacts {
    private String nom;
    private String prenom;
    private String telephone;
    private String competenceFavorite;

 public Contacts() {
    }

    public Contacts(String nom, String prenom, String telephone, String competenceFavorite) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.competenceFavorite = competenceFavorite;
    }

    // Getters et setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
     public String getTelephone() {
        return telephone;
    }

    public void settelephone(String telephone) {
        this.telephone = telephone;
    }

    

    public String getCompetenceFavorite() {
        return competenceFavorite;
    }

    public void setCompetenceFavorite(String competenceFavorite) {
        this.competenceFavorite = competenceFavorite;
    }
}
