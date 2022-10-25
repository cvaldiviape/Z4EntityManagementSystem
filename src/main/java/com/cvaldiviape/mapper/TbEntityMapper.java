package com.cvaldiviape.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cvaldiviape.dto.request.TypeDocumentRequestDTO;
import com.cvaldiviape.dto.response.EntityResponseDTO;
import com.cvaldiviape.entity.TbEntity;

@Component
public class TbEntityMapper {

	@Autowired
	private ModelMapper modelMapper;
	
	// ---------------------------------------------------------- modelMapper --------------------------------------------------------- //
	public EntityResponseDTO mapEntityToResponseDTO(TbEntity entity) {
		return this.modelMapper.map(entity, EntityResponseDTO.class);
	}
	
	public TbEntity mapRequestToEntity(TypeDocumentRequestDTO requestDTO) {
		return this.modelMapper.map(requestDTO, TbEntity.class);
	}
	
}