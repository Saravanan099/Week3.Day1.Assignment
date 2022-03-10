package Week3.Day1.Assignment5;

public class Palindrome {
	
	
	public static void main(String[] args) {

		String S1="Madam";
		String S2="";
		
			for(int i=S1.length()-1;i>=0; i--) {
				S2=S2 + S1.charAt(i);
			}
			
			if (S1.equalsIgnoreCase(S2)){
			System.out.println("Given string is palindrom");	
			}else {
				System.out.println("Given string is not palindrom");	
			}
	}

	


}
