package edu.icet.service;

import edu.icet.dto.Book;
import edu.icet.entity.BookEntity;

import java.util.List;

public interface BookService {
    void addBook(Book book);

    List<BookEntity> getBooks();

    boolean deleteBook(Long id);

    Book getBookById(Long id);
}
