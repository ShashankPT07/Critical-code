class BookStore{

public int books;

public void price(){
System.out.println("price of the book");
}
public void quantity(){
System.out.println("how many books are there");
price();
}
public void sells(){
	System.out.println("no of selled books");
	quantity();
}
public void types(){
	System.out.println("Types of books");
	sells();
}
public void size(){
	System.out.println("Size of the books");
	types();
}


}