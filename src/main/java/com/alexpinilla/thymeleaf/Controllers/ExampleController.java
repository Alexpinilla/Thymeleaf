package com.alexpinilla.thymeleaf.Controllers;

import com.alexpinilla.thymeleaf.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ExampleController {

    @GetMapping("/")
    public String index(Model model)
    {
        model.addAttribute("name","Alex");
        return "index";
    }
    @GetMapping("/index")
    public ModelAndView index1 (){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("name","Alex 2");
        return mav;
    }
    @GetMapping("/data")
    public ModelAndView indexData () {
        ModelAndView mav = new ModelAndView("data");
        mav.addObject("User", new User("Alex", "0"));
        mav.addObject("User2", new User("Alex2", "02"));
        return mav;
    }
    @GetMapping("/dataList")
    public ModelAndView dataList (){
        ModelAndView mav = new ModelAndView("dataList");
        mav.addObject("users",getUsers());
        int result = 5/0;
        return mav;
    }
    @GetMapping("/layout")
    public String exampleLayout(){
        return "layoutExample";
    }

    private List<User> getUsers(){
        List <User> users = new ArrayList<>();
        users.add(new User("User1", "0"));
        users.add(new User("User2", "0"));
        users.add(new User("User3", "0"));
        users.add(new User("User4", "0"));
        return users;
    }
}
