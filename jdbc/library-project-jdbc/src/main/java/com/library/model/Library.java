package com.library.model;

import java.util.List;

public class Library {
	
	private List<String> booksList;

	public List<String> getBooksList() {
		return booksList;
	}

	public void setBooksList(List<String> booksList) {
		this.booksList = booksList;
	}

	@Override
	public String toString() {
		return "Library [booksList=" + booksList + "]";
	}
}

