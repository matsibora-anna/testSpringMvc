package com.matsibora.test.service;

import com.matsibora.test.entity.Item;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ItemService {

    public List<Item> getItems();
}
