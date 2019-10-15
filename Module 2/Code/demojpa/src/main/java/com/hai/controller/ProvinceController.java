package com.hai.controller;


import com.hai.entity.Province;
import com.hai.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller

public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/showprovince")
    public ModelAndView showprovince() {
        List<Province> provinces = provinceService.showProvince();
        ModelAndView modelAndView = new ModelAndView("province/listprovince", "provinces", provinces);
        return modelAndView;
    }

    @GetMapping("/createprovince")
    public ModelAndView showCreateprovince() {
        ModelAndView modelAndView = new ModelAndView("/province/createprovince",
                "province", new Province());
        return modelAndView;
    }

    @PostMapping("/createprovince")
    public ModelAndView createProvince(@ModelAttribute("province") Province province) {
        provinceService.addProvince(province);
        ModelAndView modelAndView = new ModelAndView("/province/createprovince",
                "province", new Province());
        modelAndView.addObject("message", "New province is created sucessfully");
        return modelAndView;
    }
}
