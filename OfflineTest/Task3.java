import java.util.Arrays;

public class Task3 {

	public static void main (String args []){
		Task3 t3 =new Task3();
		t3.evenlySpaced(4, 2, 6);
	}
	
	public void evenlySpaced(int a, int b, int c){
		int [] nums ={a,b,c};
		Arrays.sort(nums);
		int gap1= nums[1]-nums[0];
		int gap2= nums [2]-nums[1];
		if(gap1==gap2){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
	
}
