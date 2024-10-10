package com.example.itemdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.itemdemo.entity.Item;
import com.example.itemdemo.service.Itemservice;

@RestController
public class Productcontroller {
	
	@Autowired
	private Itemservice is;
	
	@PostMapping("/item")
	public Item resiteritem(@RequestBody Item i) {
		return is.registeritem(i);
		
	}
	
	@GetMapping("/item")
	public List<Item> getitem(){
		return is.getItem();
		
	}
	
	@DeleteMapping("/item/{id}")
	public void deleteitem(@PathVariable("id") Integer id) {
		is.deleteitem(id);
	}
	
	@PutMapping("/item/{id}")
	public Item particularitem(@PathVariable("id") Integer id,@RequestBody Item e) {
		return is.updateitem(id, e);
	}

}
