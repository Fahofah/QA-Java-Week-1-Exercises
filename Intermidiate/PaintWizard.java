import java.util.ArrayList;

public class PaintWizard {
	ArrayList<Paint> pList = new ArrayList<Paint>();

	public void addToWizard(Paint a) {

		pList.add(a);
	}

	public void minWaste() {
		int temp;
		int lwTag = 0;

		temp = pList.get(0).coverage;

		for (int i = 1; i < pList.size(); i++) {
			if (pList.get(i).coverage > temp) {
				temp = pList.get(i).coverage;
				lwTag = i;
			}

		}

		System.out.println("Paint with least waste in the list is " + pList.get(lwTag).name);

	}

	public void selectCheapest(double area) {

		double ppr; // litre per room *price per room
		int fTag=0;
		ppr = (area / pList.get(0).coverage) * pList.get(0).ppl;

		// area/capacity

		for (int i = 1; i < pList.size(); i++) {
			if (ppr > ((area / pList.get(i).coverage) * pList.get(i).ppl)) {
				ppr = ((area / pList.get(i).coverage) * pList.get(i).ppl);
				fTag = i;
			}
		}
		
		System.out.println("The chepaset paint to paint this room of area " + area+ " is "+ pList.get(fTag).name + "with £"+ppr+" cost");

	}
	
	public void wasteCal(double area){
		double rem;
		double prev=0.00001;
		int tag=0;
		int tag2=-1;
		
		for(int i=0;i<pList.size();i++){
			rem=(area%pList.get(i).m2pt);//pList.get(i).m2pt)*pList.get(i).capacity;  //waste in litres
			if((Math.ceil(rem)-rem)<=(Math.ceil(prev)-prev)){
				if((Math.ceil(rem)-rem)==(Math.ceil(prev)-prev)){
					tag2=i;
				}else{
				prev=rem;
				tag=i;
				System.out.println(prev);
				}
			}
				
		}
		if(tag2!=-1){
			
		System.out.println("The least waste for this room will be obtained by using paints " + pList.get(tag).name +" & " + pList.get(tag2).name );
		} else {
			System.out.println("The least waste for this room will be obtained by using paints " + pList.get(tag).name +tag2);
		}
	}
}
