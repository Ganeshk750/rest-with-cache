package com.ganesh.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import com.ganesh.validators.AddressObjectValidation;
import com.ganesh.validators.AddressValidation;


public class User {
   
	@Min(1000)
	@Max(1000000)
	private int id;
	
	@Length(min = 4, max = 20, message = "name length should be between 4 and 10")
	private String name;
	
	@NotNull
	@AddressValidation
	private String address;
	
	@Email
	private String email;
	
   /**
     * Password must be between 4 and 8 digits long and include at least one numeric digit.
     */
    @Pattern(regexp = "^(?=.*\\d).{4,8}$", message = "Password Must Be Between 4 and 8 digits")
    private String password;
    
  @AddressObjectValidation(message = "at least 2 addresses")
 // @Valid
  private List<Address> addresses;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
}
