package Week3.Day2;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {

String text= "We learn java basics as part of java sessions in java week1";
        
        
        String[] wordArray = text.split(" ");
        
        Set<String> words=new LinkedHashSet<String>(Arrays.asList(wordArray));
        
        System.out.println(words);
        
        for(String w:words){
            System.out.println(w);
        }
        

	}

}