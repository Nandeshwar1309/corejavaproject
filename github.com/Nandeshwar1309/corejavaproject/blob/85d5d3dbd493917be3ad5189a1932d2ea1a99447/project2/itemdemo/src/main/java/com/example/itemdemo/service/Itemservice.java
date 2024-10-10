package com.example.itemdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.itemdemo.entity.Item;
import com.example.itemdemo.repository.Itemrepo;

@Service
public class Itemservice {
	
	@Autowired
	private Itemrepo ir;
	
	// create
	
	public Item registeritem(Item i) {
		return ir.save(i);
	}
	
	// Read
	
	public List<Item> getItem(){
		return (List<Item>)ir.findAll();
	}
	
	// delete
	
	public void deleteitem(Integer id) {
		ir.deleteById(id);
	}
	
	//  Update
	public Item updateitem(Integer id,Item i) {
		return ir.save(i);
		}
	
	
}
