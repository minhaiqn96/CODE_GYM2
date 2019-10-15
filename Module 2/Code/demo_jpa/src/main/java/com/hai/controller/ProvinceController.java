package com.hai.controller;


import com.hai.entity.Province;
import com.hai.exception.ResourceNotFoundException;
import com.hai.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/show")
    public ModelAndView showprovince() {
        List<Province> provinces = provinceService.showProvince();
        ModelAndView modelAndView = new ModelAndView("province/listprovince", "provinces", provinces);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateprovince() {
        ModelAndView modelAndView = new ModelAndView("/province/createprovince",
                "province", new Province());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createProvince(@ModelAttribute("province") Province province) {
        provinceService.addProvince(province);
        ModelAndView modelAndView = new ModelAndView("/province/createprovince");
        modelAndView.addObject("message", "New province is created sucessfully");
        return modelAndView;
    }

    @GetMapping("/formedit/{id}")
    public ModelAndView showeditprovince(@PathVariable Long id) throws ResourceNotFoundException {
        Province province = provinceService.editProvince(id);
        if (province != null) {
            ModelAndView modelAndView = new ModelAndView("/province/editprovince", "province", province);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/edit")
    public ModelAndView editprovince(@ModelAttribute("province") Province province) {
        provinceService.addProvince(province);
        ModelAndView modelAndView = new ModelAndView("/province/editprovince");
        modelAndView.addObject("message", "This province is update sucessfully");
        return modelAndView;
    }

    @GetMapping("/formdelete/{id}")
    public ModelAndView formEditProvince(@PathVariable Long id) throws ResourceNotFoundException {
        Province province = provinceService.editProvince(id);
        if (province != null) {
            ModelAndView modelAndView = new ModelAndView("/province/deleteprovince", "province", province);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("/delete")
    public ModelAndView deleteProvince(@ModelAttribute("province") Province province) {
        provinceService.deleteProvince(province.getId());
        ModelAndView modelAndView = new ModelAndView("/province/deleteprovince");
        modelAndView.addObject("message", "This province is deleted sucessfully");
        return modelAndView;
    }
}
