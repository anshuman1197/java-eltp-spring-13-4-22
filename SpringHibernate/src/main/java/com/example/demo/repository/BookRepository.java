package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Book;

public interface BookRepository {
	public int insertBook(Book b);
	public int updateBook(String bn,float p);
	public void deleteBook(int bid);
	public List<Book> fetchall();
}
