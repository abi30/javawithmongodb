package dev.abdulla.movies.dao;

import dev.abdulla.movies.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
