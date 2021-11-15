package booking;
import java.math.*;

public class Book {

	String source;
	String destination;
	int noofpassengers;
	String dateofjourney;
	int bookid;
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getNoofpassengers() {
		return this.noofpassengers;
	}
	public void setNoofpassengers(int noofpassengers) {
		this.noofpassengers = noofpassengers;
	}
	public String getDateofjourney() {
		return dateofjourney;
	}
	public void setDateofjourney(String dateofjourney) {
		this.dateofjourney = dateofjourney;
	}
	public int getBookid(){
		 
		return bookid;
	}
	public void setBookid(int bookid) {
		
		this.bookid = bookid;
	}
}
