package kz.aitu.onlinebook.repositories;

import kz.aitu.onlinebook.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepositoryInterface extends JpaRepository<Book, Integer> {
}
