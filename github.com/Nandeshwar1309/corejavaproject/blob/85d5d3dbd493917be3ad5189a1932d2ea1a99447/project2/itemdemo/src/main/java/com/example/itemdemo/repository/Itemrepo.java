package com.example.itemdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.itemdemo.entity.Item;

public interface Itemrepo extends CrudRepository<Item, Integer> {

}
