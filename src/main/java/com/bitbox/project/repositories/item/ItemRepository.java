package com.bitbox.project.repositories.item;

import com.bitbox.project.models.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository {
    void add(Item item);
    void delete(int itemId);
    void update(int itemId, Item updatedItem);
    Item get(int itemId);

}
