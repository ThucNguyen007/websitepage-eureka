package com.webshop.setting;

import org.springframework.data.repository.CrudRepository;

import com.webshop.common.entity.Currency;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {

}
