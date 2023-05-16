package dev.abdulla.movies;

import dev.abdulla.movies.dao.BookRepository;
import dev.abdulla.movies.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class MoviesApplication {

	@Autowired
	private BookRepository repository;

	@PostMapping
	public Book seveBook(@RequestBody Book book){
        return repository.save(book);

	}
	@GetMapping
	public List<Book> getBooks() {
		if (repository.findAll().isEmpty()) {
			return null;
		}
		return repository.findAll();
	}


	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(MoviesApplication.class, args);
	}

}
