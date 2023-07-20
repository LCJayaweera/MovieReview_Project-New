package com.lakjay.movies.Repositories;

import com.lakjay.movies.DocumentRead.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
