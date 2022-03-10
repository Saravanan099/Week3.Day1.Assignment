package Week3.Day2;
import java.util.*;  
public class FindSecondLargestCollections {
	public static int getSecondLargest(Integer[] data, int total){  
		List<Integer> list=Arrays.asList(data);  
		Collections.sort(list);  
		int element=list.get(total-2);  
		return element;  
		}  
	public static void main(String[] args) {
		
		Integer[] data = {3,2,11,4,6,7};
		
		//Pick the 2nd element from the last and print it
		System.out.println("Second Largest: "+getSecondLargest(data,6));  
				}
}

