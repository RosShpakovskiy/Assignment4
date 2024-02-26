package kz.aitu.onlinebook.controlles;

import kz.aitu.onlinebook.models.Book;
import kz.aitu.onlinebook.services.interfaces.BookServiceInterface;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookServiceInterface service;

    public BookController(BookServiceInterface service) {
        this.service = service;
    }

    @GetMapping("/")
    public List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/{book_id}")
    public ResponseEntity<Book> getById(@PathVariable("book_id") int id){
        Book book = service.getById(id);
        if(book == null)
            return new ResponseEntity(book, HttpStatus.NOT_FOUND);

        return new ResponseEntity(book, HttpStatus.OK);
    }
}
