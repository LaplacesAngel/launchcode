package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String languages(){
        return  "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>Clojure</li>" +
                "</ol>" +
                "</body></html>";
    }

    @GetMapping("/form")
    @ResponseBody
    public String createForm(){
        return "<html><body>" +
                "<form>" +
                "<label>Name: <br><input type = 'text' name='name' /></label><br><br>" +

                "<label>My number 1 favorite language<br>" +
                "<select name=\"firstlang\" id=\"firstlang\">" +
                "   <option value=\"java\">Java</option>" +
                "   <option value=\"python\">Python</option>" +
                "   <option value=\"clojure\">Clojure</option>" +
                "</select></label><br>" +

                "<label>My second favorite language<br>" +
                "<select name=\"secondlang\" id=\"secondlang\">" +
                "   <option value=\"java\">Java</option>" +
                "   <option value=\"python\">Python</option>" +
                "   <option value=\"clojure\">Clojure</option>" +
                "</select></label><br>" +

                "<label>My third favorite language<br>" +
                "<select name=\"thirdlang\" id=\"thirdlang\">" +
                "   <option value=\"java\">Java</option>" +
                "   <option value=\"python\">Python</option>" +
                "   <option value=\"clojure\">Clojure</option>" +
                "</select></label><br>" +
                "<br><input type = \"submit\" value = \"Submit!!!!!\" />" +

                "</body></html>";
    }

    @PostMapping("/form")
    @ResponseBody
    public String respondToFormSubmit(@RequestParam String name,
                                      @RequestParam String firstlang,
                                      @RequestParam String secondLang,
                                      @RequestParam String thirdlang){
        return  "<html><body>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstlang + "</li>" +
                "<li>" + secondLang + "</li>" +
                "<li>" + thirdlang + "</li>" +
                "</ol>" +
                "</body></html>";
    }

}
