package com.example.eindProject2.repositories;

import com.example.eindProject2.entities.Background;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackgroundRepository extends JpaRepository<Background, Integer> {
}
