package com.example.eindProject2.services;

import com.example.eindProject2.repositories.BackgroundCategoryPairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BackgroundCategoriePairService {
     private final BackgroundCategoryPairRepository backgroundCategoryPairRepository;

     @Autowired

    public BackgroundCategoriePairService(BackgroundCategoryPairRepository backgroundCategoryPairRepository) {
        this.backgroundCategoryPairRepository = backgroundCategoryPairRepository;
    }
}
