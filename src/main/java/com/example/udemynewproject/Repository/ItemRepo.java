package com.example.udemynewproject.Repository;

import com.example.udemynewproject.Model.Item;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class ItemRepo {

    public List<Item> fetchAllItems(){


        //Her laver man normalt SQL forbindelsen
        List<Item> items = new ArrayList<>();
        items.add(new Item("Computer", 100));
        items.add(new Item("Laptop", 150));
        items.add(new Item("iPhone", 125));

        return items;
    }


}
