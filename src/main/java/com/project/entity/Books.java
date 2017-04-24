package com.project.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by 林漠 on 2017/4/23.
 */
@Entity
@Table(name = "Books")
public class Books implements Serializable{



    @Id
    @GeneratedValue
    @Column(name = "isbn")
    private String isbn;

    @Column(name = "author_name")
    private String author_name;

    @Column(name = "title")
    private String title;
    @Column(name = "publisher_name")
    private String publisher_name;

    @Column(name = "publication_year")
    private int publication_year;

    @Column(name = "binding")
    private String binding;
    @Column(name = "source_numb")
    private int source_numb;

    @Column(name = "retail_price")
    private double retail_price;

    @Column(name = "number_on_hand")
    private int number_on_hand;

    public String getAuthor_name() {

        return author_name;

    }

    public void setAuthor_name(String author_name) {

        this.author_name = author_name;

    }

    public String getBinding() {

        return binding;

    }

    public void setBinding(String binding) {

        this.binding = binding;

    }

    public String getIsbn() {

        return isbn;

    }

    public void setIsbn(String isbn) {

        this.isbn = isbn;

    }

    public int getNumber_on_hand() {

        return number_on_hand;

    }

    public void setNumber_on_hand(int number_on_hand) {

        this.number_on_hand = number_on_hand;

    }

    public int getPublication_year() {

        return publication_year;

    }

    public void setPublication_year(int publication_year) {

        this.publication_year = publication_year;

    }

    public String getPublisher_name() {

        return publisher_name;

    }

    public void setPublisher_name(String publisher_name) {

        this.publisher_name = publisher_name;

    }

    public double getRetail_price() {

        return retail_price;

    }

    public void setRetail_price(double retail_price) {

        this.retail_price = retail_price;

    }

    public int getSource_numb() {

        return source_numb;

    }

    public void setSource_numb(int source_numb) {

        this.source_numb = source_numb;

    }

    public String getTitle() {

        return title;

    }


    public void setTitle(String title) {

        this.title = title;

    }

}