package com.matsibora.test.service;

import com.matsibora.test.entity.Item;
import com.matsibora.test.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getItems() {
        return itemRepository.findAllByDisableItemFalse();
    }

    @Override
    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public Item findById(Integer id) {
        return itemRepository.findById(id).get();
    }

    @Override
    public boolean deleteById(Integer id) {
        Item item = itemRepository.findById(id).get();
        if (item.getNumberItem() == 0) {
            item.setDisableItem(true);
            itemRepository.save(item);
            return true;
        } else {
            return false;
        }
    }
}
