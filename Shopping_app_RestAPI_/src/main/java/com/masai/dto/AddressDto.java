package com.masai.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {
		
	@Size(min = 3, max = 10, message = "Street no. should min of 3 and max of 10 Characters")
	private String streetNo;
	
	private String buildingName;
	
	@NotNull(message = "City cannot be null.")
	@NotBlank(message = "City cannot be blank.")
	@NotEmpty(message = "City cannot be empty.")
	private String city;
	
	@NotNull(message = "State cannot be null.")
	@NotBlank(message = "State cannot be blank.")
	@NotEmpty(message = "State cannot be empty.")
	private String state;
	
	@NotNull(message = "Country cannot be null.")
	@NotBlank(message = "Country cannot be blank.")
	@NotEmpty(message = "Country cannot be empty.")
	private String country;
	
	
	
	@Size(min = 6, max = 6, message = "Pincode should be of 6 digit only")
	private String pincode;


	
	
}
