package com.project.DAO;

import com.project.entity.User;

import java.util.List;

/**
 * Created by 林漠 on 2017/4/23.
 */
public interface UserDAO {
     int save(User u);

     List<User> findAll();
}
