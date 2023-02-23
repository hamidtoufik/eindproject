package com.example.eindProject2.controllers;

import com.example.eindProject2.entities.User;
import com.example.eindProject2.services.BackgroundCategoriePairService;
import com.example.eindProject2.services.BackgroundService;
import com.example.eindProject2.services.CategoryService;
import com.example.eindProject2.services.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {

    private final UserService userService;
    private final BackgroundService backgroundService;
    private final CategoryService categoryService;
    private final BackgroundCategoriePairService backgroundCategoriePairService;

    @Autowired
    public AppController(UserService userService, BackgroundService backgroundService, CategoryService categoryService, BackgroundCategoriePairService backgroundCategoriePairService) {
        this.userService = userService;
        this.backgroundService = backgroundService;
        this.categoryService = categoryService;
        this.backgroundCategoriePairService = backgroundCategoriePairService;
    }

    @GetMapping("/login")
    public String goToLoginPage(HttpSession httpSession) {
        if (httpSession.getAttribute("loggedInUserName") == null) {
            return "login";
        } else {
            return "redirect:/background";
        }
    }

    @PostMapping("/login")
    public String login(User UserReceived, HttpSession httpSession){
        System.out.println(UserReceived);

        if(userService.findByNameAndPassword(UserReceived.getName(),UserReceived.getPassword()).isPresent()){
            httpSession.setAttribute("loggedInUserName", UserReceived.getName());
            return "redirect:/background";
        }else{
            return "redirect:/login";

        }
    }


    @GetMapping("sing_in")
    public String singinPage(Model model){
        model.addAttribute("user",new User());
        return "sing_in";
    }

    @PostMapping("sing_in")
    public String singinPage(User userReceived){
        userService.create(userReceived);
        return "redirect:/login";
    }
    @GetMapping("background")
    private String backgroundPage(){
        return "/background";
    }


}
