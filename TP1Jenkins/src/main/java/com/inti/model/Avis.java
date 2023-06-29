package com.inti.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table @Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Avis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String commentaire;

@OneToMany(mappedBy = "avis", targetEntity = Hotel.class)
private List<Hotel>listeHotel;


public Avis(String commentaire) {
	super();
	this.commentaire = commentaire;
}

}