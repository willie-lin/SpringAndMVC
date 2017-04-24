package com.project.DAO.Impl;

import com.project.entity.Books;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 林漠 on 2017/4/23.
 */
@Repository
public class BooksDAOImpl implements  com.project.DAO.BooksDAO {

    @Autowired
    private SessionFactory sessionFactory;



    public List<Books> getAllBooks() {

        Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Books.class);

        return criteria.list();

    }

    public List<Books> getByAuthor(String _author) {

        String hql = "from Books where author_name = ?";

        Query q = sessionFactory.getCurrentSession().createQuery(hql);

        q.setString(0, _author);

        return q.list();

    }



    public List<Books> getByPublisher(String _publisher) {

        String hql = "from Books where publisher_name = ?";

        Query q = sessionFactory.getCurrentSession().createQuery(hql);

        q.setString(0, _publisher);

        return q.list();

    }



    public List<Books> find(String _title) {

        String hql = "FROM Books WHERE title LIKE ?";

        Query q = sessionFactory.getCurrentSession().createQuery(hql);

        q.setString(0, "%" + _title + "%");

        return q.list();

    }

}

