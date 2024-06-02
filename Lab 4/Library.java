import java.util.*;

class Library{
    String bookName;
    int serialNumber;
    double price;
    int numberAvail;
    String author;

    public Library() {}

    public Library(String bookName, int serialNumber, double price, int numberAvail, String author) {
        this.bookName = bookName;
        this.serialNumber = serialNumber;
        this.price = price;
        this.numberAvail =numberAvail ;
        this.author = author;
    }



    public void showBookDetails(){
        System.out.println("Book Name: " + bookName);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Price: " + price);
        System.out.println("Available Pieces: " +numberAvail);
        System.out.println("Author Name: " + author);
        System.out.println();
    }
	//public void issue(String bookName){
		
}

class BookInfoSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter no. of books: ");
		int n=scanner.nextInt();
		Library[] books = new Library[n];

        for (int i = 0; i < 
		n; i++) {
            System.out.println("Enter details for Book: " + (i + 1));
            System.out.print("Name: "); String bookName = scanner.nextLine();
            System.out.print("Serial Number: "); int serialNumber = scanner.nextInt();
            System.out.print("Book Price: "); double price = scanner.nextDouble();
            System.out.print("Available spaces: "); int numberAvail = scanner.nextInt();
            System.out.print("Author: "); String author = scanner.nextLine();

            books[i] = new Library(bookName,serialNumber,price,numberAvail,author);
            scanner.nextLine();
        }
		
		
        scanner.close();
    }
}
