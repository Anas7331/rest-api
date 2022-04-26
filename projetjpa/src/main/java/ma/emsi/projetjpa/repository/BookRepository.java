package ma.emsi.projetjpa.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import ma.emsi.projetjpa.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
