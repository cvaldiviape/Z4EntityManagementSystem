package com.cvaldiviape.dto.response.page;

import java.util.List;
import com.cvaldiviape.dto.response.RoleResponseDTO;
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
public class RolesPageResponseDTO {

	private List<RoleResponseDTO> roles;
	
}