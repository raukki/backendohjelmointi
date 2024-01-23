package k24op1.backend.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping("index")
    @ResponseBody
    public String returnMain(){
        return "This is the main page";
    }
    @RequestMapping("contact")
    @ResponseBody
    public String returnContact(){
        return "This is the contact page";
    }
    @RequestMapping("hello")
    @ResponseBody
    public String returnGreeting(@RequestParam String location, @RequestParam String name){
        return "Welcome to the " + location + " " + name + " !";
    }

}
