package com.matsibora.test.controller;

import com.matsibora.test.entity.Customer;
import com.matsibora.test.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List<Customer> customers = customerService.getCustomers();
        theModel.addAttribute("allcustomers", customers);
        return "list-customers";
    }

    @GetMapping("/new")
    public String addNewCustomer(Model theModel) {
        Customer customer = new Customer();
        theModel.addAttribute("customer", customer);
        return "form-add-customers";
    }

    @GetMapping("/update")
    public ModelAndView updateCustomer(@RequestParam("customerId") int customerId) {
        ModelAndView theModel = new ModelAndView("form-add-customers");
        Customer customer = customerService.findById(customerId);
        theModel.addObject("customer", customer);
        return theModel;
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/customer/list";
    }

}
