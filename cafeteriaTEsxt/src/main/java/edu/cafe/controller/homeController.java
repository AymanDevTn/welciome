package edu.cafe.controller;


 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

 

import java.util.List;

import javax.servlet.http.HttpSession;  
@Controller
public class homeController {

	 

    @GetMapping
    public String home(Model model, HttpSession session) {
    	 
    	 
        return "login";
       
         
    }
 
}
