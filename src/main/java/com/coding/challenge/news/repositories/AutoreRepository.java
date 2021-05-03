package com.coding.challenge.news.repositories;

import com.coding.challenge.news.models.entities.Autore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutoreRepository extends JpaRepository<Autore, Long> {
}
