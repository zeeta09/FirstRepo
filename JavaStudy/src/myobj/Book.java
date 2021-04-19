package myobj;

public class Book {

	public String status;
	public int pages;
	public int price;
	public int knowledge;
	public int damage;
	
	public Book(int pages) {
		this.pages = pages;		
	}
	
	public Book(int pages, int price) {
		this.pages = pages;
		this.price = price;
	}

	public void reading() {
		pages -= 30;
		knowledge += 100;
	}
	
	public void throw_away () {
		status = "Cover a book";
		damage += 200;
		price = 0;
		knowledge = 0;
	}
	
}

