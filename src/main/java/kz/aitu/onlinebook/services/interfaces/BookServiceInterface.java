package kz.aitu.onlinebook.services.interfaces;

import kz.aitu.onlinebook.models.Book;

import java.util.List;

public interface BookServiceInterface {
    List<Book> getAll();
    Book getById(int id);

}
