package com.matsibora.test.controller;

import com.matsibora.test.entity.Item;
import com.matsibora.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/list")
    public String listItems(Model theModel) {
        List<Item> items = itemService.getItems();
        theModel.addAttribute("allitems", items);
        return "list-items";
    }

    @GetMapping("/new")
    public String addNewItem(Model theModel) {
        Item item = new Item();
        theModel.addAttribute("item", item);
        return "form-add-items";
    }

    @GetMapping("/update")
    public ModelAndView updateNewItem(@RequestParam("itemId") int itemId) {
        ModelAndView theModel = new ModelAndView("form-add-items");
        Optional<Item> item = itemService.findById(itemId);
        theModel.addObject("item", item);
        return theModel;
    }

    @PostMapping("/saveItem")
    public String saveItem(@ModelAttribute("item") Item item) {
        itemService.addItem(item);
        return "redirect:/item/list";
    }


}
