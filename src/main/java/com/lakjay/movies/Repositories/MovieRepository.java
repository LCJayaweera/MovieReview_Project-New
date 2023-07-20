package com.lakjay.movies.Repositories;

import com.lakjay.movies.DocumentRead.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> { //Movie class eka,eke tyna item tami ganne

    Optional<Movie> findMovieByImdbId(String imdbId);


}
