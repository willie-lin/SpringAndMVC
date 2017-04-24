package com.project.service.Impl;

import com.project.DAO.UserDAO;
import com.project.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by 林漠 on 2017/4/23.
 */
@Service("userService")
@Transactional
public class UserServiceImpl implements com.project.service.UserService{

    @Autowired
    private UserDAO userDAO;

    public void saveUsers(List<User> us) {
        for (User u : us) {
            userDAO.save(u);
        }
    }

    public List<User> getAllUsernames() {
        return userDAO.findAll();
    }

//    public List<String> getAllUsernames() {
//        List<String> users = new ArrayList<String>();
//        users.add("MarK");
//        users.add("Ken");
//        users.add("Fowafolo");
//        return users;
//    }


}
