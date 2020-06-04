package com.matsibora.test.service;

import com.matsibora.test.entity.Item;
import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Item> getItems();
    void addItem(Item item);
    Item findById(Integer id);
    boolean deleteById(Integer id);

}
