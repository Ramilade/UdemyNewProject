package com.example.udemynewproject.Service;

import com.example.udemynewproject.Model.Item;
import com.example.udemynewproject.Repository.ItemRepo;
import com.example.udemynewproject.Repository.ItemRepoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepoJPA itemRepoJPA;

    public List<Item> fetchAllItems(){
        return itemRepoJPA.findAll();
    }

    public void addItem(Item i){
        itemRepoJPA.save(i);
    }

    public void deleteItem(int id){
        itemRepoJPA.deleteById(id);
    }

    public Item findItemById(int id){
        return itemRepoJPA.getReferenceById(id);

    }

    public void updateItem(Item i){
        itemRepoJPA.save(i);
    }

}


