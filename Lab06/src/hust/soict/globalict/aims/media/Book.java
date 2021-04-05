package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{

	private List<String> authors = new ArrayList<String>();

	public Book() {
		super();
		a = currenta++;
		currenta++;
	}
	Book(String title){
		super(title);
		a = currenta++;
		currenta++;
		}
	Book(String title, String category){
		super(title, category);
		a = currenta++;
		currenta++;
	}	
	Book(String title, String category, List<String> authors){
		super(title, category);
		this.authors = authors;
		a = currenta++;
		currenta++;
	}
	void addAuthor(String authorName) {
		for(int i = 0; i < authors.size(); i++) {
			if(authors.get(i).compareTo(authorName) == 1) {
				System.out.println("the author is already in the List before adding");
				return;
			}
		}
		authors.add(authorName);
	}
	
	void removeAuthor(String authorName) {
		for(int i = 0; i < authors.size(); i++) {
			if(authors.get(i).compareTo(authorName) == 1) {
				authors.remove(i);
				System.out.println("already removed the author");
				return;
			}
		}
		System.out.println("the author is already in the List before adding");
	}

}