
public class Books extends Items {
	
	String genre;
	String author;
	
	public Books( String title, boolean inLibrary, String genre, String author){
		super(title,inLibrary);
		this.genre=genre;
		this.author=author;
		
	
	}
	
	public String toString(){
		return ("\nRegistration: " + reg +"\nTitle: " +title+ "\nAvailable: " +inLibrary+ "\nGenre: "+ genre + "\nAuthor: "+ author);
	}
}
