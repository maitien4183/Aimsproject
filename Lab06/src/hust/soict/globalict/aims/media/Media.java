package hust.soict.globalict.aims.media;

import java.util.Scanner;

public class Media {

	protected String title;
	protected String category;
	protected float cost;
	protected int a;
	public static int currenta = 0;
	
	public int geta() {
		return a;
	}
	public void setId(int b) {
		a = b;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	public Media() {
		super();
		a = currenta++;
		currenta++;
	}
	
	public Media(String title) {
		super();
		this.title = title;
		a = currenta++;
		currenta++;
	}
	public Media(String title, String category) {
		super();
		this.title = title;
		this.category = category;
		a = currenta++;
		currenta++;
	}
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		a = currenta++;
		currenta++;
	}
	public void showDiscInfo() {
		System.out.print("- [" + getTitle() + "] - [" + getCategory() 
				+ "]" + " - [" + "] - ["
				+ "]" + ": [" + getCost() + "] $");
	}
	
}
