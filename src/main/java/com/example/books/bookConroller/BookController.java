package com.example.books.bookConroller;

import com.example.books.dto.BookDTO;
import com.example.books.dto.CreateBookDTO;
import com.example.books.dto.UpdateBookDTO;
import com.example.books.entity.Book;
import com.example.books.service.BookService;
import com.example.books.utils.mapper.BookMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;
    private final BookMapper bookMapper;

    @PostMapping
    public BookDTO create(@RequestBody CreateBookDTO createBookDTO) {
        Book book = bookService.create(createBookDTO);
        return bookMapper.toBookDTO(book);
    }

    @GetMapping
    public List<Book> readAll() {
        return bookService.readAll();
    }

    @PutMapping({"/id"})
    public Book update(@PathVariable Long id, @RequestBody UpdateBookDTO updateBookDTO) {
        return bookService.update(id, updateBookDTO);
    }

    @DeleteMapping({"/id"})
    public HttpStatus delete(@PathVariable Long id) {
        bookService.delete(id);
        return HttpStatus.OK;
    }
}
