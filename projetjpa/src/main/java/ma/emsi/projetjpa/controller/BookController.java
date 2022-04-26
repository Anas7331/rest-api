package ma.emsi.projetjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.emsi.projetjpa.entity.Book;
import ma.emsi.projetjpa.service.BookService;


@RestController

public class BookController {
    @Autowired
    private BookService service;

    @PostMapping("emsi_api/addbook")
    public Book addBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @GetMapping("emsi_api/books")
    public List<Book> getBooks(){
        return service.getBooks();
    }

    @GetMapping("emsi_api/books/{id}")
    public Book getBooksbyID(@PathVariable int id){
        return service.getBooksbyID(id);
    }

    @DeleteMapping("emsi_api/deletebook/{id}")
    public String deleteBook(@PathVariable int id){
        return service.deleteBook(id);
    }

    @PutMapping("emsi_api/updatebook")
    public Book updateBook(@RequestBody Book book){
        return service.updateBook(book);
    }
}
