package com.matsibora.test.service;

import com.matsibora.test.entity.Item;
import java.util.List;
import java.util.Optional;

public interface ItemService {

    public List<Item> getItems();

    public void addItem(Item item);
    public Optional<Item> findById(Integer id);
    public void updateItem(Item item);

}
