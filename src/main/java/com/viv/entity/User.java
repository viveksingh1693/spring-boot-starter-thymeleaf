package com.viv.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

    @NotBlank(message = "Name is mandatory")
	@Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long")
	private String name;

    @NotBlank(message = "Email is mandatory")
	private String email;

}
