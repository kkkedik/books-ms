package com.example.books.utils.mapper;

import com.example.books.dto.BookDTO;
import com.example.books.dto.CreateBookDTO;
import com.example.books.dto.UpdateBookDTO;
import com.example.books.entity.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class BookMapper {
    public Book toBook(CreateBookDTO createBookDTO) {
        return Book.builder()
                .bookName(createBookDTO.getBookName())
                .author(createBookDTO.getAuthor())
                .build();
    }

    public Book updateBookDTOToBook(Long id, UpdateBookDTO updateBookDTO) {
        return Book.builder()
                .id(id)
                .author(updateBookDTO.getAuthor())
                .bookName(updateBookDTO.getBookName())
                .studentId(updateBookDTO.getStudentId())
                .build();
    }

    public BookDTO toBookDTO(Book book){
        return BookDTO.builder()
                .id(book.getId())
                .author(book.getAuthor())
                .bookName(book.getAuthor())
                .studentId(book.getStudentId())
                .build();
    }

}
