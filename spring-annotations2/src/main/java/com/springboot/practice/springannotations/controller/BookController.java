package com.springboot.practice.springannotations.controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.practice.springannotations.pack.Book;

//@Controller
//public class BookController {
//	@RequestMapping("/book")
//	@ResponseBody
//	public Book book() {
//	Book book=new Book("The theory of Time", 120, 124);
//		return book;
//		
//	}

//}
@RestController
@RequestMapping("api")
public class BookController {
	@RequestMapping(value = { "book", "newbook" }, method = RequestMethod.GET, produces = {
			org.springframework.http.MediaType.APPLICATION_ATOM_XML_VALUE,
			org.springframework.http.MediaType.APPLICATION_JSON_VALUE }, consumes = {
					org.springframework.http.MediaType.APPLICATION_ATOM_XML_VALUE,
					org.springframework.http.MediaType.APPLICATION_JSON_VALUE })
	//public Book book() {
	//	Book book = new Book("The theory of Time", 120, 124);
	//	return book;

	//}

	// @RequestMapping(value = "createbook",method = RequestMethod.POST)
	@PostMapping(value = "/books/createbook") // consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
//	@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<Book> createBook(@RequestBody Book book) {

		System.out.println(book.bookSerialNo);

		System.out.println(book.bookName);
		System.out.println(book.getBookPrice());
		return new ResponseEntity<>(book, HttpStatus.CREATED);

	}

	@PutMapping("/books/updatebook/{bookSerialNo}")
	public ResponseEntity<Book> updateBook(@PathVariable int bookSerialNo, @RequestBody Book updatebook) {
		System.out.println(bookSerialNo);
		System.out.println(updatebook.getBookName());
		System.out.println(updatebook.getBookPrice());
		updatebook.setBookSerialNo(bookSerialNo);
		return ResponseEntity.ok(updatebook);

	}

	@DeleteMapping("/books/deletebook/{bookName}")
	public ResponseEntity<String> deleteBook(@PathVariable String bookName) {
		System.out.println(bookName);
		return ResponseEntity.ok("book deleted");
	}

	@GetMapping("/book/query")
	public ResponseEntity<Book> querycheck(
			@RequestParam(name = "bookName") String bookName,
			@RequestParam(name = "bookSerialNo") int bookSerialNo) {
		System.out.println(bookName);
		System.out.println(bookSerialNo);

		Book b = new Book();
		b.setBookName(bookName);
		b.setBookSerialNo(bookSerialNo);

		return ResponseEntity.ok(b);

	}

}
