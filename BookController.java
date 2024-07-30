package com.example.book;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/book")
	public List<Book> get(){
		return bookservice.getAll();
	}
	
	
}
