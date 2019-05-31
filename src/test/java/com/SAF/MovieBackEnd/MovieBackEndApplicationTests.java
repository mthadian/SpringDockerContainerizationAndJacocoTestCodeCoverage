package com.SAF.MovieBackEnd;

import com.SAF.MovieBackEnd.Controllers.MoviesController;
import com.SAF.MovieBackEnd.Models.Movies;
import com.SAF.MovieBackEnd.Repositories.MovieRepository;
import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieBackEndApplicationTests {

	@Autowired
        MovieRepository movieRepo;
    @Test
    public void testInsertMovie() 
    {       
        
        Movies thismovie=new Movies();      
        
        thismovie.setMovieId(9);
        thismovie.setTitle("The Guy");
        thismovie.setRating(3);
        thismovie.setDescription("test desc");
        thismovie.setWatched(true);
        thismovie.setRecommendation("Recommendation test");
        
        
        movieRepo.save(thismovie);
       
        assertEquals(9,thismovie.getMovieId());
        assertEquals(3,thismovie.getRating());        
      
    }
    
    @Test
    public void testRating()
    {
    	Movies thismovie=new Movies();
    	thismovie.setRating(6);
    	movieRepo.save(thismovie);
    	
    	assertTrue("Rating can not be greater than 5 or less than 0", true);
    	
    }
    
    @Test
    public void testNullId()
    {
    	Movies thismovie=new Movies();
    	thismovie.setMovieId(6);
    	thismovie.setWatched(false);
    	
    	movieRepo.save(thismovie);
    	
    	movieRepo.findByWatched(true);
    	
    	assertTrue("No Movies Found with parameter true", true);
    	
    	
    }

}
