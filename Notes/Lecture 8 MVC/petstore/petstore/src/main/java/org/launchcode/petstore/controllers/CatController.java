package org.launchcode.petstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CatController {

    @PostMapping("cats")
    @ResponseBody
    public String showSomeCats(@RequestParam String catType){
        return "<html><body>" +
                "<h1>Cats!</h1>" +
                "<p>" + catType + "<p>" +
                "</html></body>";
    }

}
