
public class Maps extends Items{
	
	String area;
	String scale;
	
	public Maps( String title, boolean inLibrary,String area,String scale){
		super(title,inLibrary);
		this.area=area;
		this.scale=scale;
		
	}
	
	public String toString(){
		return ("\nRegistration: " + reg +"\nTitle: " +title+ "\nAvailable: " +inLibrary+ "\nArea: "+ area+"\nScale: "+ scale);
	}

}
