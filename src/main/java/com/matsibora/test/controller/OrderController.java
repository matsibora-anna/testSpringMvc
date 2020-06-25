package com.matsibora.test.controller;

import com.matsibora.test.entity.Order;
import com.matsibora.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/list")
    public String listOrders(Model theModel) {
        List<Order> orders = orderService.getOrders();
        theModel.addAttribute("allorders", orders);
        return "list-orders";
    }

    @GetMapping("/new")
    public String addNewOrder(Model theModel) {
        Order order = new Order();
        theModel.addAttribute("order", order);
        return "form-add-orders";
    }

    @GetMapping("/update")
    public ModelAndView updateOrder(@RequestParam("orderId") int orderId) {
        ModelAndView theModel = new ModelAndView("form-add-orders");
        Order order = orderService.findById(orderId);
        theModel.addObject("order", order);
        return theModel;
    }

    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order") Order order) {
        orderService.save(order);
        return "redirect:/order/list";
    }

}

