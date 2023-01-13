package br.com.book.service;

import br.com.book.entity.Book;
import br.com.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void save(Book book) {

        this.bookRepository.save(book);

    }
}
