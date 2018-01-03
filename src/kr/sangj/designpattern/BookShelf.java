package kr.sangj.designpattern;

import java.util.Iterator;

public class BookShelf implements Aggregate {

	private books[] books;
	private int last = 0;
	
	public books getBookAt(int index) {
		
		return books[index];
	}
	
	public void addBooks(books bookName) {
		this.books[last] = bookName;
		last++;
	}
	
	public int getLength() {
		
		return last;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
