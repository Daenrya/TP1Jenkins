package com.inti.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table 
@Data @AllArgsConstructor @NoArgsConstructor
public class Destination {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDestination;
	private long longitude;
	private long latitude;
	
	public Destination(long longitude, long latitude) {
		super();
		this.longitude = longitude;
		this.latitude = latitude;
	} 
	

}
