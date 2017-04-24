package com.project.service.Impl;

import com.project.DAO.BooksDAO;
import com.project.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 林漠 on 2017/4/23.
 */
@Service
@Transactional
public class BookServiceImpl implements com.project.service.BookService {

    @Autowired
    private BooksDAO booksDAO;



    public List<Books> getAllBooks() {

        return booksDAO.getAllBooks();

    }



    public List<Books> getByAuthor(String _author) {

        return booksDAO.getByAuthor(_author);

    }



    public List<Books> getByPublisher(String _publisher) {

        return booksDAO.getByPublisher(_publisher);

    }



    public List<Books> find(String _title) {

        return booksDAO.find(_title);

    }

}