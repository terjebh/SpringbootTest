package com.noderia.crud.controller;

import com.noderia.crud.model.Person;
import com.noderia.crud.model.UserGreeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class User {

    @GetMapping(path = "/user")

    public String user(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        if (name == null) {
            name = "world";
        }
        model.addAttribute("greeting", UserGreeting.getGreeting(name));
        model.addAttribute("folk", Arrays.asList(
                new Person("Ole Berg", 42),
                new Person("Kari Berg", 33),
                new Person("Jens Jensen", 47)
        ));

        return "user";

    }


}
