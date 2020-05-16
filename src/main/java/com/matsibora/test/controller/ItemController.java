package com.matsibora.test.controller;

import com.matsibora.test.entity.Item;
import com.matsibora.test.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

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

    @PostMapping("/saveItem")
    public String saveItem(@ModelAttribute("item") Item item) {
        itemService.addItem(item);
        return "redirect:/item/list";
    }


}
