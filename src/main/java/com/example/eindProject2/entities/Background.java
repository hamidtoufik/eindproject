package com.example.eindProject2.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Background {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private int backgroundID;

    private String backgroundName;
    private int rating;
    private int numberOfDownloads;
    private int height;
    private int width;

@OneToMany
    List<BackgroundCategoryPair> backgroundCategoryPairs;

    public Background() {
    }

    public Background(int backgroundID, String backgroundName, int rating, int numberOfDownloads, int height, int width, List<BackgroundCategoryPair> backgroundCategoryPairs) {
        this.backgroundID = backgroundID;
        this.backgroundName = backgroundName;
        this.rating = rating;
        this.numberOfDownloads = numberOfDownloads;
        this.height = height;
        this.width = width;
        this.backgroundCategoryPairs = backgroundCategoryPairs;
    }

    public int getBackgroundID() {
        return backgroundID;
    }

    public void setBackgroundID(int backgroundID) {
        this.backgroundID = backgroundID;
    }

    public String getBackgroundName() {
        return backgroundName;
    }

    public void setBackgroundName(String backgroundName) {
        this.backgroundName = backgroundName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getNumberOfDownloads() {
        return numberOfDownloads;
    }

    public void setNumberOfDownloads(int numberOfDownloads) {
        this.numberOfDownloads = numberOfDownloads;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }


}
