package com.hai.controller;

import com.hai.entity.Employee;
import com.hai.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping(value = {"/", "/employee"})
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = {"/list", "/"})
    public ModelAndView listCustomers(@RequestParam("s") Optional<String> s, @PageableDefault(size = 5) Pageable pageable) {
        Page<Employee> employees;
        if (s.isPresent()) {
            employees = employeeService.findAllByNameContaining(s.get(), pageable);
        } else {
            employees = employeeService.showEmployee(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("/list");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
//
//    @GetMapping(value = {"/list", "/"})
//    public ModelAndView listEmployee(@PageableDefault(size = 5) Pageable pageable) {
//        Page<Employee> employees = employeeService.showEmployee(pageable);
//        ModelAndView modelAndView = new ModelAndView("/list", "employees", employees);
//        return modelAndView;
//    }

    @GetMapping("/create")
    public ModelAndView formCreate() {
        ModelAndView modelAndView = new ModelAndView("/create", "employees", new Employee());
        return modelAndView;
    }

    @PostMapping("/create")
    public ModelAndView create(@Validated @ModelAttribute("employees") Employee employee, BindingResult bindingResult) {
        new Employee().validate(employee, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            ModelAndView modelAndView = new ModelAndView("create");
            return modelAndView;
        } else {
            employeeService.createEmployee(employee);
            ModelAndView modelAndView = new ModelAndView("create");
            modelAndView.addObject("message","New create is created sucessfully");
            return modelAndView;
        }
    }

    @GetMapping("/edit/{id}")
    public ModelAndView formEdit(@PathVariable("id") long id) {
        Employee employee = employeeService.findId(id);
        ModelAndView modelAndView = new ModelAndView("/edit", "employee", employee);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView editEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.createEmployee(employee);
        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("message", "This employee is edited successfully");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView formDelete(@PathVariable("id") long id) {
        Employee employee = employeeService.findId(id);
        ModelAndView modelAndView = new ModelAndView("/delete", "employee", employee);
        return modelAndView;
    }

    @PostMapping("/delete")
    public ModelAndView deleteEmployee(@RequestParam("id") long id) {
        employeeService.deleteEmployee(id);
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("message", "This employee is deleted successfully");
        return modelAndView;
    }
}
