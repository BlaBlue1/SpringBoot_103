package com.example.springboot_103;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String myVals(Model model){
        model.addAttribute("myvar", "How are you?");
        model.addAttribute("myvar2", "Where are you from?");
        return "myvals";
    }


}
