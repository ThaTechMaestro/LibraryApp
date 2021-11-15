package com.project.libraryapptest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "book")
public class Book implements Serializable {


    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;


    @Column(name = "authors")
    private String authors;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "publishing_year")
    private String publishingYear;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;









}
