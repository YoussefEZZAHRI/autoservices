package com.autoservices.piece.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Marque implements Serializable{
	@Id @GeneratedValue
	private Long idMarque;
	private String nom;
	
	@OneToMany(mappedBy="marque",fetch=FetchType.LAZY)
	private Collection<Modele> modele;
	
	

}
