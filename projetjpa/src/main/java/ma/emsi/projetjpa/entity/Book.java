package ma.emsi.projetjpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BOOK_TBL")

public class Book {
    @Id
    @GeneratedValue
    private int id;
    @Column(nullable = false, length = 50)
    private String title;
    @Column(nullable = false, updatable = false)
    private String publisher;
    @Column(nullable = false)
    private String releasedate;
    @Column(nullable = false)
    private int pgnbr;
    @Column(unique=true, nullable = false, updatable = false)
    private int isbn;
    @Column(nullable = false)
    private String lastconst;
    @Column(nullable = false)
    private String availb;
}
