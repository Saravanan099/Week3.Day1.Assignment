package Week3.Day2;
import java.util.ArrayList;
import java.util.List;
public class FindIntersection {

	public static void main(String[] args) {
		List <Integer> Volume1=new ArrayList<Integer>();
		Volume1.add(3);
		Volume1.add(2);
		Volume1.add(11);
		Volume1.add(4);
		Volume1.add(6);
		Volume1.add(7);
		
		List<Integer> Volume2=new ArrayList<Integer>();
		Volume2.add(1);
		Volume2.add(2);
		Volume2.add(8);
		Volume2.add(4);
		Volume2.add(9);
		Volume2.add(7);
		
		
		for(int i=0;i<Volume1.size();i++) {
			for(int j=0;j<Volume2.size();j++) {
				if(Volume1.get(i)==Volume2.get(j)) 
					System.out.println(Volume1.get(i));
				}
			}
	}
	}