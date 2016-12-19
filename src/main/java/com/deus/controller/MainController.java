package com.deus.controller;

import com.deus.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("userJSP")
public class MainController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main(@ModelAttribute("userJSP") User user) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("index");

        return modelAndView;
    }

    //    hack
    @ModelAttribute("userJSP")
    public User createUser() {
        return new User();
    }

    @RequestMapping(value = "/check-user")
    public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("secondPage");
        modelAndView.addObject("userJSP", user);

        return modelAndView;
    }
}
