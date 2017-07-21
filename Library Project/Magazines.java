
public class Magazines extends Items{
	
	double volDotIssue;
	
	public Magazines( String title, boolean inLibrary,double volDotIssue){
		super(title,inLibrary);
		this.volDotIssue=volDotIssue;
		
	}
	
	public String toString(){
		return ("\nRegistration: " + reg +"\nTitle: " +title+ "\nAvailable: " +inLibrary+ "\nVolume & Issue: "+ volDotIssue);
	}

}
