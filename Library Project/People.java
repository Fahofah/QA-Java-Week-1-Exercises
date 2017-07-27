
public abstract class People {
	
	protected int id;
	protected String name;
	protected int age;
	private static int id_index=0;
	
	public People( String name, int age){
		id_index++;
		this.id=id_index;
		this.name=name;
		this.age=age;
		
	}
	
	
}
