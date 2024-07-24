package com.codewithamar.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoyId;
	@NotBlank
	@Size(min=5, message = "min size of title is 5")
	private String categoryTitle;
	@NotBlank
	@Size(min = 10,message="min size of description is 10")
	private String categoryDescription;
	
}
 