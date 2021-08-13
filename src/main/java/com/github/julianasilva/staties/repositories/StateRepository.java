package com.github.julianasilva.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.julianasilva.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long> {
}
