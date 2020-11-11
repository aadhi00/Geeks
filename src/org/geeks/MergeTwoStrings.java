package org.geeks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.RecursiveAction;

public class MergeTwoStrings {
	  static  StringBuilder result = new StringBuilder(); 
	    // Function for alternatively merging two strings 
	    public static StringBuilder merge(String s1, String s2) 
	    { 
	        // To store the final string 
	       
	  
	        // For every index in the strings 
	        for (int i = 0; i < s1.length() || i < s2.length(); i++) { 
	  
	            // First choose the ith character of the 
	            // first string if it exists 
	            if (i < s1.length()) 
	                result.append(s1.charAt(i)); 
	  
	            // Then choose the ith character of the 
	            // second string if it exists 
	            if (i < s2.length()) 
	                result.append(s2.charAt(i)); 
	        } 
	  
	        return result; 
	    } 
	  
	    // Driver code 
	    public static void main(String[] args) 
	    { 
	        String s1 = "aspire"; 
	        String s2 = "systems"; 
	        System.out.println(merge(s1, s2)); 
	        System.out.println(result);
	    } 
	
}
