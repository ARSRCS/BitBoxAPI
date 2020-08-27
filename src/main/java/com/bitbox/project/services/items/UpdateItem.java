package com.bitbox.project.services.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.item.ItemRepository;
import com.bitbox.project.models.Item;

@Service
public class UpdateItem {

    private ItemRepository itemRepository;

    @Autowired
    public void UpdateItem(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    public void execute(int itemId, Item updatedItem){
        itemRepository.update(itemId,updatedItem);
    }
}
