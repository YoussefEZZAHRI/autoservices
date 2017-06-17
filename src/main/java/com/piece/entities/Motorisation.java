package com.piece.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Motorisation implements Serializable{
	@Id @GeneratedValue
	 private Long idMoteur;
	 private String nom;
	 @OneToMany(mappedBy="moteur",fetch=FetchType.LAZY)
		private Collection<Carburant> carburant;
	 
	 @ManyToOne
		@JoinColumn(name="CODE_MOD")
		private Modele modele;
	 

}
