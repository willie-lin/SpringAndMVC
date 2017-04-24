package com.project.service;

import com.project.entity.Books;

import java.util.List;

/**
 * Created by 林漠 on 2017/4/23.
 */
public interface BookService {
    List<Books> getAllBooks();

    List<Books> getByAuthor(String _author);

    List<Books> getByPublisher(String _publisher);

    List<Books> find(String _title);
}
