package services.items;

import models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.item.ItemRepository;

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
