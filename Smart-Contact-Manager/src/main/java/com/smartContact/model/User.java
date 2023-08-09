package com.smartContact.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name="USER")
@Data
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; 
	private String name;
	@Column(unique = true)
	private String email;
	private String password;
	private String role;
	private boolean enabled;
	private String imageURL;
	@Column(length = 500)
	private String about;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy = "user")
	private List<Contact> contacts=new ArrayList<>();
}
