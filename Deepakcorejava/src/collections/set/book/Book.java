package collections.set.book;

public class Book {
private int id;
private String name,author,publisher;
private static int idGen=401;
public Book() {
	id=idGen++;
}
public Book( String name, String author, String publisher) {
	this();
	this.name = name;
	this.author = author;
	this.publisher = publisher;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public static int getIdGen() {
	return idGen;
}
public static void setIdGen(int idGen) {
	Book.idGen = idGen;
}
@Override
public String toString() {
	return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
}

}
