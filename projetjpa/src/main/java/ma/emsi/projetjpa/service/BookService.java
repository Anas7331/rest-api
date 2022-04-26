package ma.emsi.projetjpa.service;

import java.util.List;

import org.hibernate.annotations.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.emsi.projetjpa.entity.Book;
import ma.emsi.projetjpa.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repository;
    public Book saveBook(Book book){
        return repository.save(book);
    }

    @OrderBy(clause = "Titre ASC")
    public List<Book> getBooks(){
        return repository.findAll();
    }

    public Book getBooksbyID(int ID){
        return repository.findById(ID).orElse(null);
    }

    public String deleteBook(int ID){
        repository.deleteById(ID);
        return "Book deleted!";
    }

    public Book updateBook(Book book){
        Book books=repository.findById(book.getId()).orElse(null);
        books.setTitle(book.getTitle());
        books.setPublisher(book.getPublisher());
        books.setReleasedate(book.getReleasedate());
        books.setPgnbr(book.getPgnbr());
        books.setIsbn(book.getIsbn());
        books.setLastconst(book.getLastconst());
        books.setAvailb(book.getAvailb());
        return repository.save(books);
    }
}
