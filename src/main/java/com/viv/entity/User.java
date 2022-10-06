package com.viv.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotBlank(message = "Name is mandatory")
	@Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
	private String firstName;
	
	@NotBlank(message = "Name is mandatory")
	@Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
	private String lastName;

	@NotBlank(message = "Email is mandatory")
	private String email;

}
