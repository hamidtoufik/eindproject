package com.example.eindProject2.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int categoryID;

    private String categoryName;


@OneToMany

    List<BackgroundCategoryPair> backgroundCategoryPairs;

    public Category() {
    }

    public Category(int categoryID, String categoryName, List<BackgroundCategoryPair> backgroundCategoryPairs) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.backgroundCategoryPairs = backgroundCategoryPairs;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
