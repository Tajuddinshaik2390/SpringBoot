package com.example.book;



import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Transactional
public class BookService {
	
	@Autowired
	private BookRepository bookrepository;
	
	
	public List<Book> getAll(){
		return bookrepository.findAll();
	}


	
	

}
