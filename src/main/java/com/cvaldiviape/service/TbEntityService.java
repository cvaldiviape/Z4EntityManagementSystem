package com.cvaldiviape.service;

import com.cvaldiviape.dto.request.EntityRequestDTO;
import com.cvaldiviape.dto.response.EntityResponseDTO;
import com.cvaldiviape.dto.response.page.EntitiesPageResponseDTO;
import com.cvaldiviape.service.base.BaseService;

public interface TbEntityService extends BaseService<EntitiesPageResponseDTO, EntityResponseDTO, EntityRequestDTO, Integer> {

}