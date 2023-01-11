package br.com.book.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;



@RequiredArgsConstructor
@Table(name = "book")
@Entity(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne // chave estrangeira
    @JoinColumn(name = "author_id") // vai ser o id da chave estrangeira
    private Author author;


}
