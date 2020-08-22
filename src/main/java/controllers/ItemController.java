package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import services.items.*;
import models.Item;

@CrossOrigin(origins="*")
@RestController
public class ItemController {

    private CreateItem createItem;
    private DeleteItem deleteItem;
    private UpdateItem updateItem;
    private GetItem getItem;

    @Autowired
    public ItemController(CreateItem createItem, DeleteItem deleteItem, UpdateItem updateItem, GetItem getItem){
        this.createItem=createItem;
        this.deleteItem=deleteItem;
        this.updateItem=updateItem;
        this.getItem=getItem;
    }

    @GetMapping("/itemlist")
    public String itemList(){
        return "";
    }
    @ResponseBody
    @PostMapping("/createItem")
    public void createItem(@RequestBody Item item){
        createItem.execute(item);
    }
    @ResponseBody
    @PostMapping("/updateItem/{id}")
    public void updateItem(@PathVariable("id") int itemId, @RequestBody Item updatedItem){
        updateItem.execute(itemId,updatedItem);
    }
    @ResponseBody
    @PostMapping("/deleteItem/{id}")
    public void deleteItem(@PathVariable("id") int itemId){
        deleteItem.execute(itemId);
    }
    @ResponseBody
    @PostMapping("/getItem/{id}")
    public void getItem(@RequestBody Item item){
        createItem.execute(item);
    }
    @ResponseBody
    @GetMapping("items/{itemId}")
    public Item getItem(@PathVariable("itemId") int itemId){
        return getItem.execute(itemId);
    }
}
