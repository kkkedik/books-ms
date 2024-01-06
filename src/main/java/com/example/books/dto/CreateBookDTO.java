package com.example.books.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookDTO {
    private String bookName;
    private String author;
}
