package com.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

	private int bookId;
	private String bookName;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	@PostConstruct //deprecated in java 9 and removed in java 11 to use this add javax.annotation-api dependency
	public void init() {
		System.out.println("In init method");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("in destroy method");
	}
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}
	
	
}
