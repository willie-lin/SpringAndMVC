package com.project.DAO;

import com.project.entity.Books;

import java.util.List;

/**
 * Created by 林漠 on 2017/4/23.
 */
public interface BooksDAO {
    List<Books> getAllBooks();

    List<Books> getByAuthor(String _author);

    List<Books> getByPublisher(String _publisher);

    List<Books> find(String _title);
}
