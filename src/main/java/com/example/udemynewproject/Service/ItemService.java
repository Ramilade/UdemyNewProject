package com.example.udemynewproject.Service;

import com.example.udemynewproject.Model.Item;
import com.example.udemynewproject.Repository.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepo itemRepo;

    public List<Item> fetchAllItems(){
        return itemRepo.fetchAllItems();
    }

    public void addItem(Item i){
        itemRepo.addItem(i);
    }

    public void deleteItem(int id){
        itemRepo.deleteItem(id);
    }

    public Item findItemById(int id){
        return itemRepo.findItemById(id);

    }

    public void updateItem(Item i){
        itemRepo.updateItem(i);
    }

}


