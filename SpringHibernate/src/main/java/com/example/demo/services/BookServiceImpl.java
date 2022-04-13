package com.example.demo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Transactional
	@Override
	public int insertBook(Book b) {
		return bookRepository.insertBook(b);
	}

	@Transactional
	@Override
	public int updateBook(String bn, float p) {
		// TODO Auto-generated method stub
		return bookRepository.updateBook(bn, p);
	}
	@Transactional
	@Override
	public void deleteBook(int bid) {
		// TODO Auto-generated method stub
		bookRepository.deleteBook(bid);
	}

	@Override
	public List<Book> fetchall() {
		// TODO Auto-generated method stub
		return bookRepository.fetchall();
	}

}
