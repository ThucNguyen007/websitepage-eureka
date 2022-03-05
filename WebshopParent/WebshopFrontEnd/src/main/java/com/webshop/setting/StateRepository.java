package com.webshop.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.webshop.common.entity.Country;
import com.webshop.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
	
}
