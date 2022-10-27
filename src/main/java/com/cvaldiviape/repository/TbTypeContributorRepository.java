package com.cvaldiviape.repository;

import java.util.Optional;
import com.cvaldiviape.entity.TbTypeContributor;
import com.cvaldiviape.repository.base.BaseRepository;

public interface TbTypeContributorRepository extends BaseRepository<TbTypeContributor, Integer> {

	public Optional<TbTypeContributor> findByName(String name);
	
	public Boolean existsByName(String name);
	
}