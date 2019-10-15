package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String method0() {
        return "method0";
    }

    @RequestMapping(value = {"/method1", "/method1/one", "/method1/two"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String method1() {
        return "method1";
    }

    @RequestMapping(value = "/method3", method = {RequestMethod.GET, RequestMethod.POST})
    public String method3() {
        return "method3";
    }

    @RequestMapping(value = "/method4", headers = "name=code", method = RequestMethod.POST)
    public String method4() {
        return "method4";
    }

    @RequestMapping(value = "/method5", headers = {"name=code", "id=100"})
    public String method5() {
        return "method5";
    }

    @RequestMapping(value = "/method6", consumes = "application/json")
    public String method6() {
        return "method6";
    }

    @RequestMapping(value = "/method7/{id}", method = RequestMethod.GET)
    public ModelAndView method7(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView("method7", "id", id);
        return modelAndView;
    }

    @RequestMapping(value = "/method8/{id}/{name}", method = RequestMethod.GET)
    public ModelAndView method8(@PathVariable("id") int id, @PathVariable String name) {
        Object[] arrLink = new Object[2];
        arrLink[0] = id;
        arrLink[1] = name;
        ModelAndView modelAndView = new ModelAndView("method8", "arrLink", arrLink);
        return modelAndView;
    }
}
