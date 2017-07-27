
public class Task4 {

	public static void main(String[] args) {
		Task4 t4= new Task4();
		t4.reWirte("Pancreas", 3);

	}

	public void reWirte(String s, int i) {
		String part1="";
		for(int x=0;x<i;x++){
			part1+=s.charAt(x);
		}
		for(int y=s.length()-i;y<s.length();y++){
			
			part1+=s.charAt(y);
		}
//		String Part1 = String.valueOf(part1);
//		String Part2= String.valueOf(part2);
		System.out.println(part1);
		
	}
}
