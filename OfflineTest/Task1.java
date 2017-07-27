
public class Task1 {

	public static void main(String args []){
		Task1 t = new Task1();
		t.doublize("Hi-There");
		
	}
	
	public void doublize(String s){
		char [] charA=s.toCharArray();
		char [] charAx2= new char[charA.length*2];
		int y=0;
		
		for(int i=0;i<charA.length;i++){
			 charAx2[i+y]=charA[i];
			 charAx2[i+y+1]=charA[i];
			 y=y+1;
		}
		System.out.println(charAx2);
	}
}
