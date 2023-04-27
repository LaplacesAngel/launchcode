package org.launchcode.petstore.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DogController {

    @GetMapping("/paul")
    @ResponseBody
    public String paulName (){
        return " is cool";
    }

    //GET /dog
    @GetMapping("/dog/{name}")
    @ResponseBody
    public String barkWithName (@PathVariable String name) {
        return name + " Barked! and is " + 11 + " years old";
    }

    @GetMapping("/doggi")
    @ResponseBody
    public String bark (@RequestParam String name, @RequestParam int age, @RequestParam String butt){
        return name + " has barked and " + name + " is " + age + " years old and her butt is filled with " + butt;
    }

    @GetMapping("bork")
    @ResponseBody
    public String borkMan(){
        return "<html><body>"+
                    "<h1>Borkman LIVES!!</h1>"+
                    "<form action= \"add\" method=\"post\">" +
                    "<input type= \"text\" name = 'name' />" +
                    "<input type=\"submit\" value=\"add\"/>" +
                    "<p>and will ride again..</p>"+
                    "<p>  TONIGHT</p>" +
                    "<p> but this time.. he's not alone<p>" +
                    "<p> for he has his trusty sidekick" +
                    "<form ></form>" +
                    "<h2><b>\"name\"</h2>" +
                "</body></html>";
    }

    @PostMapping("add")
    @ResponseBody
    public String respondBack (){
        return "You're here!";
    }

}
