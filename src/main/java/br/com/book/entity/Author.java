package br.com.book.entity;

import jakarta.persistence.*;
import lombok.*;

@Table(name = "author")
@Entity(name = "author")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "name")
    private String name;

    public Author(String name, Long id){
        this.name = name;
        this.id = id;
    }
}
