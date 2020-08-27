package com.bitbox.project.services.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.item.ItemRepository;

@Service
public class DeleteItem {

    private ItemRepository itemRepository;

    @Autowired
    public void DeleteItem(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    public void execute(int itemId){
        itemRepository.delete(itemId);
    }
}
