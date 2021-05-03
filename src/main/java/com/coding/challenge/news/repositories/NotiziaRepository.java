package com.coding.challenge.news.repositories;

import com.coding.challenge.news.models.entities.Notizia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotiziaRepository extends JpaRepository<Notizia,Long> {
}
