package com.cvaldiviape.repository;

import java.util.Optional;
import com.cvaldiviape.entity.TbEntity;
import com.cvaldiviape.repository.base.BaseRepository;

public interface TbEntityRepository extends BaseRepository<TbEntity, Integer> {

	public Optional<TbEntity> findByCompanyName(String companyName);
	
	public Optional<TbEntity> findByCommercialName(String commercialName);
	
	public Optional<TbEntity> findByNroDocument(String nroDocument);
	
	public Boolean existsByCompanyName(String companyName);
	
	public Boolean existsByCommercialName(String commercialName);
	
	public Boolean existsByNroDocument(String nroDocument);
	
}