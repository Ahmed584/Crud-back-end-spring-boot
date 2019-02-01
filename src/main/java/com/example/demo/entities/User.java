package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;



@Entity
public class User implements Serializable {
	
	
	@Id
	@GeneratedValue()
	private Long id;
	
	private String nom;
	private String prenom;
	
	public User() {
		
	}
	
	
	public User(String nom, String prenom) {
		
		this.nom = nom;
		this.prenom = prenom;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


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

}
