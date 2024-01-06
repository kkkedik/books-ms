package com.example.books.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Book")
@Table(name = "book")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @SequenceGenerator(
            name = "book_sequence",
            sequenceName = "book_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "book_sequence"
    )
    private Long id;

    @Column(
            name = "book_name",
            nullable = false,
            columnDefinition = "VARCHAR(30)"
    )
    private String bookName;

    @Column(
            name = "author",
            nullable = false,
            columnDefinition = "VARCHAR(30)"
    )
    private String author;

    @Column(
            name = "student_id",
            nullable = false
    )
    private Long studentId;
}
