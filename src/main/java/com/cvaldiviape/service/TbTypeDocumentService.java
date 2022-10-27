package com.cvaldiviape.service;

import com.cvaldiviape.dto.request.TypeDocumentRequestDTO;
import com.cvaldiviape.dto.response.TypeDocumentResponseDTO;
import com.cvaldiviape.dto.response.page.TypeDocumentsPageResponseDTO;
import com.cvaldiviape.dto.response.page.base.PageBase;
import com.cvaldiviape.service.base.BaseService;

public interface TbTypeDocumentService extends BaseService<PageBase<TypeDocumentResponseDTO>, TypeDocumentResponseDTO, TypeDocumentRequestDTO, Integer> {

}