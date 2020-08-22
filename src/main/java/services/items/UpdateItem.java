package services.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.item.ItemRepository;
import models.Item;

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
