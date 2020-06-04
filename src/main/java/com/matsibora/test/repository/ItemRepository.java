package com.matsibora.test.repository;

import com.matsibora.test.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {

    List<Item> findAllByDisableItemFalse();

}
