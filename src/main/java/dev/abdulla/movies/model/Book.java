package dev.abdulla.movies.model;


import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "books")
public class Book {

    @Id
    private int id;
    private String name;
    private String authorName;
    private int price;
}
