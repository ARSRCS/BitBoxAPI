package services.items;

import models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.item.ItemRepository;

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
