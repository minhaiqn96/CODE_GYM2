package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @GetMapping("/")
    public String getConvert() {
        return "index";
    }

    @PostMapping("/viewVND")
    public String viewVND(@RequestParam float usd, @RequestParam float rate, Model model) {
        float vnd = usd * rate;
        model.addAttribute("usd",usd);
        model.addAttribute("rate",rate);
        model.addAttribute("vnd", vnd);
        return "viewVND";
    }
}
