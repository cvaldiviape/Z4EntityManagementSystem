package com.cvaldiviape.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.cvaldiviape.dto.request.TypeDocumentRequestDTO;
import com.cvaldiviape.dto.response.TypeDocumentResponseDTO;
import com.cvaldiviape.dto.response.page.TypeDocumentsPageResponseDTO;
import com.cvaldiviape.service.TbTypeDocumentService;

@Service
@Transactional
public class TbTypeDocumentServiceImpl implements TbTypeDocumentService {

	// ---------------------------------------------------- services ---------------------------------------------------- //
	@Override
	public TypeDocumentsPageResponseDTO getAll(Integer numberPage, Integer sizePage, String sortBy, String sortDir) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeDocumentResponseDTO getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeDocumentResponseDTO create(TypeDocumentRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeDocumentResponseDTO update(Integer id, TypeDocumentRequestDTO requestDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TypeDocumentResponseDTO delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}