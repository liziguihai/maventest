package com.lgh;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/index.do")
public class MainController {
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "index";
    }
}
