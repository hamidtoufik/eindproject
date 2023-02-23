package com.example.eindProject2.repositories;

import com.example.eindProject2.entities.BackgroundCategoryPair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BackgroundCategoryPairRepository extends JpaRepository<BackgroundCategoryPair, Integer> {
}
