package com.webshop.shipping;

import org.springframework.data.repository.CrudRepository;

import com.webshop.common.entity.Country;
import com.webshop.common.entity.ShippingRate;

public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);
}
