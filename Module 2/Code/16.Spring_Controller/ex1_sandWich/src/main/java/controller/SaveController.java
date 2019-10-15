package controller;

import com.sun.org.apache.regexp.internal.recompile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaveController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @PostMapping("/save")
    public ModelAndView condiment(@RequestParam("condiment") String[] condiment) {
        ModelAndView modelAndView = new ModelAndView("condiment","condiments",condiment);
//        System.out.println("abv " + condiment[0]);
        return modelAndView;
    }
}
