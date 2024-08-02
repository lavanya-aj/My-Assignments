package day2assignment;

public class library {
	public String addbook(String book) {
		
		System.out.println("Books added Succesfully");
		return book="Power Of Positive Thinking";
		
		
	}
	public void booksissued() {
		System.out.println("Book Issued");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
library bl = new library();




System.out.println(bl.addbook(null));

bl.booksissued();
	}

}
