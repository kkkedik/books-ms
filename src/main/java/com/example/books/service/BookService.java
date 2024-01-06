package com.example.books.service;


import com.example.books.dto.BookDTO;
import com.example.books.dto.CreateBookDTO;
import com.example.books.dto.UpdateBookDTO;
import com.example.books.entity.Book;
import com.example.books.repositories.BookRepository;
import com.example.books.utils.mapper.BookMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    public Book create(CreateBookDTO createBookDTO) {
        return bookRepository.save(bookMapper.toBook(createBookDTO));
    }

    public List<Book> readAll() {
        return bookRepository.findAll();
    }

    public Book update(Long id, UpdateBookDTO updateBookDTO) {
        return bookRepository.save(bookMapper.updateBookDTOToBook(id,updateBookDTO));
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
