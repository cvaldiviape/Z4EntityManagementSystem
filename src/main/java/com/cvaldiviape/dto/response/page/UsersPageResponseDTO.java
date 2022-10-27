package com.cvaldiviape.dto.response.page;

import java.util.List;
import com.cvaldiviape.dto.response.UserResponseDTO;
import com.cvaldiviape.dto.response.page.base.PageBase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UsersPageResponseDTO {

	private List<UserResponseDTO> elements;
	
}