package com.example.udemynewproject.Repository;

import com.example.udemynewproject.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ItemRepoJPA extends JpaRepository<Item, Integer> {
}
