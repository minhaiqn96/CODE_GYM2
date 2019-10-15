package com.hai.controller;

import com.hai.entity.Customer;
import com.hai.entity.Province;
import com.hai.exception.ResourceNotFoundException;
import com.hai.service.CustomerService;
import com.hai.service.ProvinceService;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public List<Province> provinces() {
        return provinceService.showProvince();
    }

    @GetMapping(value = {"/show", "/"})
    public ModelAndView showListCustomer() {
        List<Customer> customers = customerService.showCustomer();
        ModelAndView modelAndView = new ModelAndView("/customer/showcustomer", "customers", customers);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate() {
        ModelAndView modelAndView = new ModelAndView("/customer/createcustomer", "customer", new Customer());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView createCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.addCustomer(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/createcustomer");
        modelAndView.addObject("message", "New customer is created sucessfully");
        return modelAndView;
    }

    @GetMapping("/edit")
    public ModelAndView showFormEdit(@RequestParam("id") Long id) {
        Customer customer = customerService.editCustomer(id);
        ModelAndView modelAndView = new ModelAndView("/customer/editcustomer", "customer", customer);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.addCustomer(customer);
        ModelAndView modelAndView = new ModelAndView("/customer/editcustomer");
        modelAndView.addObject("message", "This customer is edited sucessfully");
        return modelAndView;
    }

    @GetMapping("/delete")
    public String showFormDelete(@RequestParam("id") Long id) throws ResourceNotFoundException {
        customerService.deleteCustomer(id);
        return "redirect:/customer/";
    }
}