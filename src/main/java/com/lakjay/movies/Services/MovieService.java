package com.lakjay.movies.Services;


import com.lakjay.movies.DocumentRead.Movie;
import com.lakjay.movies.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
     return movieRepository.findAll();
    }

//    public Optional<Movie> singleMovie(ObjectId id){
//        return  movieRepository.findById(id);
//    }

    public Optional<Movie> singleMovie(String imdbId){
      return  movieRepository.findMovieByImdbId(imdbId);
  }

}
