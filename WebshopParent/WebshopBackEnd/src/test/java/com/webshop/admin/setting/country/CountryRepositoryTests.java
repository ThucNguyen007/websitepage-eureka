package com.webshop.admin.setting.country;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.webshop.common.entity.Country;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class CountryRepositoryTests {
	@Autowired private CountryRepository repo;
	
	@Test
	public void testCreateCountry() {
		Country country = repo.save(new Country("Vietnam", "VN"));
		assertThat(country).isNotNull();
		assertThat(country.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testCreateCountry2() {
		Country country = repo.save(new Country("United States of America", "U.S.A"));
		assertThat(country).isNotNull();
		assertThat(country.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testCreateCountry3() {
		Country country = repo.save(new Country("Canada", "CA"));
		assertThat(country).isNotNull();
		assertThat(country.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testCreateCountry4() {
		Country country = repo.save(new Country("Mexico", "MEX"));
		assertThat(country).isNotNull();
		assertThat(country.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testListCountries() {
		List<Country> listCountries = repo.findAllByOrderByNameAsc();
		listCountries.forEach(System.out::println);
		
		assertThat(listCountries.size()).isGreaterThan(0);
	}

	@Test
	public void testUpdateCountry() {
		Integer id = 1;
		String name = "Vietnam";
		
		Country country = repo.findById(id).get();
		country.setName(name);
		
		Country updatedCountry = repo.save(country);
		
		assertThat(updatedCountry.getName()).isEqualTo(name);
	}
	
	@Test
	public void testGetCountry() {
		Integer id = 3;		
		Country country = repo.findById(id).get();
		assertThat(country).isNotNull();
	}
	
	@Test
	public void testDeleteCountry() {
		Integer id = 5;
		repo.deleteById(id);
		
		Optional<Country> findById = repo.findById(id);
		assertThat(findById.isEmpty());
	}
}
