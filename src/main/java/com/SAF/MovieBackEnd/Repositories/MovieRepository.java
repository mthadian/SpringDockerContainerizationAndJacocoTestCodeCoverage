/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SAF.MovieBackEnd.Repositories;

import com.SAF.MovieBackEnd.Models.Movies;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PMMuthama
 */
public interface MovieRepository extends JpaRepository<Movies, Integer> 
{
    public List<Movies> findByWatched(Boolean Watched);
    
}
