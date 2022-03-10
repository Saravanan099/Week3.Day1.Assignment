package Week3.Day2;
import java.util.HashSet;
import java.util.Set;
public class FindDuplicatesSet {

	public static void main(String[] args) {
	int arr[] = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	Set<Object> arrSet = new HashSet<Object>();
	for (int i = 0; i < arr.length; i++) {
	if (arrSet.contains(arr[i])) {
	System.out.println(arr[i]);
	} else {
	arrSet.add(arr[i]);
	}
	}	
	}
	}