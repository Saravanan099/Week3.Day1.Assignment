package Week3.Day1.Assignment5;

import java.io.*;
import java.util.*;

public class CharOccurance {

	public static void main(String[] args) {
		//given string
        String str = "welcome to chennai";

        //declare hashmap
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();

        //convert string to character array
        char[] arr = str.toCharArray();

        //traverse every character and count the Occurrences
        for(char c:arr){

          //filter out white spaces
          if(c != ' '){
            if(count.containsKey(c)){
              //if character already traversed, increment it
              count.put(c, count.get(c) + 1);
            }else{
              //if character not traversed, add it to hashmap
              count.put(c,1);
            }
          }
          
        }

        //traverse the map and print the number of occurences of a character
        for(Map.Entry entry : count.entrySet()){
          System.out.println("Occurrences of " + entry.getKey() + " = " + entry.getValue());
        }
    }
}