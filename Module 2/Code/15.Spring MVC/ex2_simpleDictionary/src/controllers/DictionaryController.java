package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    private static Map<String, String> listDic = new HashMap<>();

    static {
        listDic.put("apple", "Qua tao");
        listDic.put("love", "Tinh yeu");
        listDic.put("romantic", "Lang Man");
    }

    @GetMapping( value ={"/","/index"})
    public String getHomeDictionary() {
        return "index";
    }

    @PostMapping("/result")
    public String viewResult(@RequestParam String eng, Model model) {
        String result = listDic.get(eng);
        if (result == null) {
            result = "Not Found";
        }
        model.addAttribute("eng",eng);
        model.addAttribute("result",result);
        return "result";
    }
}
