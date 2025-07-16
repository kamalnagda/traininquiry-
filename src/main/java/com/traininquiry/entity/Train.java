package com.traininquiry.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Train {

	@Id
	private int id;
	private String name;
	
	
	
}
