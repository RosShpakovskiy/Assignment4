package kz.aitu.onlinebook.services;

import kz.aitu.onlinebook.models.Book;
import kz.aitu.onlinebook.repositories.BookRepositoryInterface;
import kz.aitu.onlinebook.services.interfaces.BookServiceInterface;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class BookService implements BookServiceInterface {

    private final BookRepositoryInterface repo;

    public BookService(BookRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<Book> getAll() {
        return repo.findAll();
    }

    @Override
    public Book getById(int id) {
        return repo.findById(id).orElse(null);
    }
}
