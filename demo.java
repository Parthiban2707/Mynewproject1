
public class Bike {
	private String Bike_Name;
	private int mileage;
	public Bike(String bike_Name, int mileage) {
		super();
		Bike_Name = bike_Name;
		this.mileage = mileage;
	}
	public String getBike_Name() {
		return Bike_Name;
	}
	public void setBike_Name(String bike_Name) {
		Bike_Name = bike_Name;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}
class Book
{
	private String Book;
	private String Author_Name;
	public Book(String book, String author_Name) {
		super();
		Book = book;
		Author_Name = author_Name;
	}
	public String getBook() {
		return Book;
	}
	public void setBook(String book) {
		Book = book;
	}
	public String getAuthor_Name() {
		return Author_Name;
	}
	public void setAuthor_Name(String author_Name) {
		Author_Name = author_Name;
	}
	
}
class Brain
{
	private String Colour;
	private int weight;
	public Brain(String colour, int weight) {
		super();
		Colour = colour;
		this.weight = weight;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
class Heart
{
	private int weight;
	private int Bpm;
	public Heart(int weight, int bpm) {
		super();
		this.weight = weight;
		Bpm = bpm;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getBpm() {
		return Bpm;
	}
	public void setBpm(int bpm) {
		Bpm = bpm;
	}
	
}
class Human
{
	Brain B = new Brain("Grey",289);
	Heart h = new Heart(200, 72);
	void hasA(Bike b,Book A)
	{
		System.out.println("Bike Name:"+b.getBike_Name());
		System.out.println("Bike Mileage:"+b.getMileage());
		System.out.println("Book Author_Name:"+A.getAuthor_Name());
		System.out.println("Book Name:"+A.getBook());
	}
}
public class Demo {

	public static void main(String[] args) {
		Human H = new Human();
		Bike b = new Bike("Pulsar",35);
		Book A = new Book("Robert","Rich Dad Poor Dad");
		System.out.println(H.B.getColour());
		System.out.println(H.B.getWeight());
		System.out.println(H.h.getBpm());
		System.out.println(H.h.getWeight());
		H.hasA(b, A);
		

	}

}
