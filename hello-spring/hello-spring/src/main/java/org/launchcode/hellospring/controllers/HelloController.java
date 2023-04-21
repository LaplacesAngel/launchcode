package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    //handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye(){
        return "Goodbye, Spring!";
    }

    @PostMapping("Goodbye")
    public String goodByePost(){
        return "bye bye";
    }

    @RequestMapping(value = "hellogoodbye", method = {RequestMethod.GET, RequestMethod.POST})
    public String hellogoodbye(){
        return "hibye";
    }

    //handles request of the form /hello?name=launchcode
    @GetMapping("hello")
    @ResponseBody
    public String helloWithQueryParam(@RequestParam String name){
        return "Hello, " + name + "!";
    }

    //handles requests of the form /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithPathParam (@PathVariable String name){
        return "Hello, " + name + "!";
    }

    @GetMapping("venus/{orbiter}")
    @ResponseBody
    public String venusOrbiter(@PathVariable String orbiter) {
        return orbiter + " currently orbits Venus.";
    }

    @GetMapping("venus")
    @ResponseBody
    public String venusSurface(@RequestParam String terrestrial) {
        if (terrestrial == "true") {
            return "Venus is rocky.";
        } else {
            return "Venus is gaseous.";
        }
    }
}
