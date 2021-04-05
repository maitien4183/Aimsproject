package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media{

	private int length;
	private String directory;

	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		a = currenta++;
		currenta++;
	}
	public DigitalVideoDisc(String title, String category) {
		super();
		this.title = title;
		this.category = category;
		a = currenta++;
		currenta++;
	}
	public DigitalVideoDisc(String title, String category, String directory) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		a = currenta++;
		currenta++;
	}
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
		a = currenta++;
		currenta++;
	}
	
	public void showDiscInfo() {
		System.out.print("- [" + getTitle() + "] - [" + getCategory() 
				+ "]" + " - [" + getDirectory() + "] - [" + getLength() 
				+ "]" + ": [" + getCost() + "] $");
	}
	
}