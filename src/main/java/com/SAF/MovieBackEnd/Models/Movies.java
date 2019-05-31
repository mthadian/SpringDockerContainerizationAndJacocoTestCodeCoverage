/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SAF.MovieBackEnd.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

/**
 *
 * @author PMMuthama
 */

@Entity
public class Movies 
{
    @Id
    private int movieId;
    private String title;
    
    @Size(min = 1, max = 200)
    private String description;
    private int rating;
    private String recommendation;
    private boolean watched;

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    @Override
    public String toString() {
        return "Movies{" + "movieId=" + movieId + ", title=" + title + ", description=" + description + ", rating=" + rating + ", recommendation=" + recommendation + ", watched=" + watched + '}';
    }
    
    
    
    
}
