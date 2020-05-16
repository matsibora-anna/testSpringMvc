package com.matsibora.test.service;

import com.matsibora.test.entity.Item;
import java.util.List;

public interface ItemService {

    public List<Item> getItems();

    public void addItem(Item item);
}
