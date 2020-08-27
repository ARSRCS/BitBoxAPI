package com.bitbox.project.services.items;

import com.bitbox.project.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bitbox.project.repositories.item.ItemRepository;

@Service
public class CreateItem {
    private ItemRepository itemRepository;

    @Autowired
    public void CreateItem(ItemRepository itemRepository){
        this.itemRepository=itemRepository;
    }

    public void execute(Item item){
        itemRepository.add(item);
    }

}
