package com.project.service;

import com.project.entity.User;

import java.util.List;

/**
 * Created by 林漠 on 2017/4/23.
 */
public interface UserService {
    public void saveUsers(List<User> us);
    public List<User> getAllUsernames();


//    public List<String> getAllUsernames();

}
