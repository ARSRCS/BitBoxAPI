package com.bitbox.project.services.items;

import com.bitbox.project.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.item.ItemRepository;

@Service
public class GetItem {
    private ItemRepository itemRepository;

    @Autowired
    public GetItem(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public Item execute(int itemId){
        return itemRepository.get(itemId);
    }
}
