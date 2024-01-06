package com.example.books.dto;

import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateBookDTO {
    private String bookName;
    private String author;
    private Long studentId;
}
