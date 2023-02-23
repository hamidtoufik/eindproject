package com.example.eindProject2.services;

import com.example.eindProject2.entities.Background;
import com.example.eindProject2.repositories.BackgroundRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BackgroundService {

    private final BackgroundRepository backgroundRepository;

    @Autowired

    public BackgroundService(BackgroundRepository backgroundRepository) {
        this.backgroundRepository = backgroundRepository;
    }
    public List<Background> getAllBackgrounds(){
        return backgroundRepository.findAll();
    }
}
