package com.example.eindProject2.entities;

import jakarta.persistence.*;

@Entity
public class BackgroundCategoryPair {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)

    private int backgroundCategoryPairID;

    @ManyToOne
    @JoinColumn(name = "background_background_id")
    private Background background;

    @ManyToOne
    @JoinColumn(name = "category_category_id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public BackgroundCategoryPair() {
    }

    public BackgroundCategoryPair(int backgroundCategoryPairID, Background background, Category category) {
        this.backgroundCategoryPairID = backgroundCategoryPairID;
        this.background = background;
        this.category = category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Background getBackground() {
        return background;
    }

    public void setBackground(Background background) {
        this.background = background;
    }

    public int getBackgroundCategoryPairID() {
        return backgroundCategoryPairID;
    }

    public void setBackgroundCategoryPairID(int backgroundCategoryPairID) {
        this.backgroundCategoryPairID = backgroundCategoryPairID;
    }

}
