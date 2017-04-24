package com.project.controller;

import com.project.entity.Books;
import com.project.entity.User;
import com.project.service.BookService;
import com.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 林漠 on 2017/4/23.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserService userService;

//    @RequestMapping("")
//    public String home(){
//        List<User> us = new ArrayList<User>();
//        User u = new User();
//        u.setUsername("MarK");
//        us.add(u);
//        u = new User();
//        u.setUsername("Fawofolo");
//        us.add(u);
//        userService.saveUsers(us);
//        return "index";
//    }

    @RequestMapping("/json")
    @ResponseBody
    public List<User> json(){
        return userService.getAllUsernames();
    }

    @Autowired
    private BookService bookService;

    @RequestMapping("")
    public String index(Model model){

        List<Books> list = bookService.getAllBooks();

        model.addAttribute("books", list);

        return  "BookList";

    }



    @RequestMapping(value = "/find", method = RequestMethod.POST)

    public String find(@RequestParam("title") String title, Model model){

        List<Books> list = bookService.find(title);

        model.addAttribute("books", list);

        return  "BookList";

    }



    @RequestMapping(value = "/author")

    public String author(@RequestParam("author") String author, Model model){

        List<Books> list = bookService.getByAuthor(author);

        model.addAttribute("books", list);

        return  "BookList";

    }



    @RequestMapping(value = "/publisher")

    public String publisher(@RequestParam("publisher") String publisher, Model model){

        List<Books> list = bookService.getByPublisher(publisher);

        model.addAttribute("books", list);

        return  "BookList";

    }



    @RequestMapping("/list")
    public String list(Model model){

        List<Books> list = bookService.getAllBooks();

        model.addAttribute("books", list);

        return  "BookList";

    }
}
