package com.agrichain.longestsubstring;

import java.util.*;
public class LongestSubstring {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Input Sting : ");
    	String stringUserInput = sc.next();
    	longSubString(stringUserInput);
    }
	public static  void longSubString(String s) {
    	
        String input = s; // Sample input string
        int maxLength = 0; // Length of the longest substring
        int start = 0; // Starting index of the current substring
        String longestSubstring = ""; // Initialize the longest substring

        for (int end = 0; end < input.length(); end++) {
            char c = input.charAt(end); // Current character

            for (int j = start; j < end; j++) {
                if (input.charAt(j) == c) {
                    start = j + 1; // Update the start index to skip the repeating character
                    break;
                }
            }

            int currentLength = end - start + 1; // Length of the current substring
            if (currentLength > maxLength) {
                maxLength = currentLength; // Update the maxLength
                longestSubstring = input.substring(start, end + 1); // Update the longestSubstring
            }
        }

        System.out.println("Longest substring without repeating characters: " + longestSubstring);
        System.out.println("Length of the longest substring without repeating characters: " + maxLength);
    }
}
