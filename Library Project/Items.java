
public abstract class Items {

	protected String title;
	protected boolean inLibrary;
	protected int reg;
	private static int reg_index=0;

	public Items() {
		reg_index=reg_index+1;
		reg = reg_index;
		System.out.println("Blank");
	}

	public Items( String title, boolean inLibrary) {
		reg_index=reg_index+1;
		reg = reg_index;
		this.title = title;
		this.inLibrary = inLibrary;
		
	}
	
	

}
