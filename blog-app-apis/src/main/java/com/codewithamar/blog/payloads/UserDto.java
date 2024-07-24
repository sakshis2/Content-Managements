package com.codewithamar.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
	private int id;
	@NotEmpty
	@Size(min=3,message="name must be min of 3 character")
	private String name;
	@Email(message="Email address is not valid")
	private String email;
	@NotEmpty
	@Size(min=6,max=12,message="password must be min of 6 char and max of 12 character")
	private String password;
	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();

}   
