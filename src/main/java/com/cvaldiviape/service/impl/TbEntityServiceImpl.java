package com.cvaldiviape.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cvaldiviape.dto.request.EntityRequestDTO;
import com.cvaldiviape.dto.response.EntityResponseDTO;
import com.cvaldiviape.dto.response.page.EntitiesPageResponseDTO;
import com.cvaldiviape.service.TbEntityService;

@Service
@Transactional
public class TbEntityServiceImpl implements TbEntityService {

	// ---------------------------------------------------- services ---------------------------------------------------- //
	@Override
	public EntitiesPageResponseDTO getAll(Integer numberPage, Integer sizePage, String sortBy, String sortDir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityResponseDTO getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityResponseDTO create(EntityRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityResponseDTO update(Integer id, EntityRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EntityResponseDTO delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}