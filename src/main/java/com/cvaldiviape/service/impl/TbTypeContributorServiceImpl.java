package com.cvaldiviape.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cvaldiviape.dto.request.TypeContributorRequestDTO;
import com.cvaldiviape.dto.response.TypeContributorResponseDTO;
import com.cvaldiviape.dto.response.page.TypeContributorsPageResponseDTO;
import com.cvaldiviape.service.TbTypeContributorService;

@Service
@Transactional
public class TbTypeContributorServiceImpl implements TbTypeContributorService {

	// ---------------------------------------------------- services ---------------------------------------------------- //
	@Override
	public TypeContributorsPageResponseDTO getAll(Integer numberPage, Integer sizePage, String sortBy, String sortDir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeContributorResponseDTO getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeContributorResponseDTO create(TypeContributorRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeContributorResponseDTO update(Integer id, TypeContributorRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeContributorResponseDTO delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}