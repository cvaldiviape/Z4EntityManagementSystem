package com.cvaldiviape.repository;

import java.util.Optional;
import com.cvaldiviape.entity.TbTypeDocument;
import com.cvaldiviape.repository.base.BaseRepository;

public interface TbTypeDocumentRepository extends BaseRepository<TbTypeDocument, Integer> {

	public Optional<TbTypeDocument> findByCode(String code);
	
	public Optional<TbTypeDocument> findByName(String name);
	
	public Boolean existsByCode(String code);
	
	public Boolean existsByName(String name);
	
}