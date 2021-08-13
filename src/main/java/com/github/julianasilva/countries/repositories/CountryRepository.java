package com.github.julianasilva.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.julianasilva.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
