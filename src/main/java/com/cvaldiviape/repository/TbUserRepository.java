package com.cvaldiviape.repository;

import java.util.Optional;
import com.cvaldiviape.entity.TbUser;
import com.cvaldiviape.repository.base.BaseRepository;

public interface TbUserRepository extends BaseRepository<TbUser, Integer> {
	
	public Optional<TbUser> findByUsername(String email);
	
}