package Week3.Day2;
import java.util.*;

public class MissingElementInAnArrayCollection {

	public static void main(String[] args) {
		// Here is the input
				List <Integer> arr=new ArrayList<Integer>(Arrays.asList(1,2,3,4,7,6,8));
		        Collections.sort(arr);
				System.out.println(arr);
				int i;
				for(i=arr.get(0);i<=arr.size();i++) {
					if(i!=arr.get(i-1))
					{
						System.out.println("The missing number is:"+i);
					break;
					}
					}
					
				}
				
				

		
	}