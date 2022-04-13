package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.services.BookService;

@RestController
@RequestMapping("/")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping(path="/save")
	public String saveController(@RequestBody Book b) {
		int i=bookService.insertBook(b);
		if(i>0)
			return "Success";
		else
			return "Try Again";
	}
	
	@PutMapping(path="update/{bname}/{p}")
	public String updateController(@PathVariable String bname,@PathVariable float p) {
		int i=bookService.updateBook(bname, p);
		if(i>0)
			return "Success";
		else
			return "Try";
		
	}
	
	@DeleteMapping(path="delete/{bid}")
	public String deleteController(@PathVariable int bid) {
		bookService.deleteBook(bid);
		return "Deleted";
		
	}
	
	@GetMapping(path="getall")
	public List<Book> fetchController(){
		return bookService.fetchall();
		
	}
	
}
